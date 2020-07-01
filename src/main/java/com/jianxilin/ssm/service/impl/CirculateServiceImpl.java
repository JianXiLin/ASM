package com.jianxilin.ssm.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.jianxilin.ssm.dao.ComployeeMapper;
import com.jianxilin.ssm.dao.ZcInfoMapper;
import com.jianxilin.ssm.dao.ZcInoutMapper;
import com.jianxilin.ssm.dto.PageDTO;
import com.jianxilin.ssm.entity.Comployee;
import com.jianxilin.ssm.entity.ZcInfo;
import com.jianxilin.ssm.entity.ZcInout;
import com.jianxilin.ssm.entity.ZcInoutExample;
import com.jianxilin.ssm.enums.errorCode;
import com.jianxilin.ssm.service.CirculateService;
import com.jianxilin.ssm.vo.ResultVO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JianxiLin
 * @date 6.23 - 8:16
 */
@Service
public class CirculateServiceImpl implements CirculateService {

    @Autowired
    ZcInoutMapper zcInoutMapper;

    @Autowired
    ZcInfoMapper zcInfoMapper;

    @Autowired
    ComployeeMapper comployeeMapper;

    /**
     * 分页获取资产借出记录信息
     *
     * @param page 页码
     * @param size 每页显示的数量
     * @return
     */
    @Override
    public ResultVO getCirculateList(Integer page, Integer size) {

        if (null != page && null != size && page >= 0 && size >= 0) {
            // 获取总页数
            long totalNum = zcInoutMapper.countByExample(new ZcInoutExample());
            if ((page - 1) * size >= totalNum) {
                return ResultVO.fail(errorCode.OUTOFPAGESIZE_ERROR);
            } else {
                PageDTO pageDTO = null;
                // 分页查询的参数 偏移的位置（起始位置）
                Integer offset = (page - 1) * size;
                // 单页的数量
                Integer limit = size;
                // 获取结果集
                RowBounds rowBounds = new RowBounds(offset, limit);
                ZcInoutExample zcInoutExample = new ZcInoutExample();
                zcInoutExample.setOrderByClause("`inout_no` DESC");
                List<ZcInout> ZcInouts = zcInoutMapper.selectByExampleWithRowbounds(zcInoutExample, rowBounds);

                pageDTO = new PageDTO(ZcInouts, page, (int) totalNum, size);

                return ResultVO.success(pageDTO);
            }

        } else {
            // 参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 获取单个资产借出记录信息
     *
     * @param inoutNo 资产id
     * @return
     */
    @Override
    public ResultVO getCirculate(Integer inoutNo) {
        if (null != inoutNo) {
            ZcInout ZcInout = zcInoutMapper.selectByPrimaryKey(inoutNo);
            return ResultVO.success(ZcInout);
        } else {
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 修改资产借出记录信息
     *
     * @param zcInout
     * @return
     */
    @Override
    public ResultVO updateCirculate(ZcInout zcInout) {

        com.jianxilin.ssm.entity.ZcInout dbZcInout = zcInoutMapper.selectByPrimaryKey(zcInout.getInoutNo());
        if (null != dbZcInout && null != dbZcInout.getZcId()) {
            BeanUtils.copyProperties(zcInout, dbZcInout);
            ZcInoutExample example = new ZcInoutExample();
            example.createCriteria().andInoutNoEqualTo(zcInout.getInoutNo());
            int i = zcInoutMapper.updateByExampleSelective(dbZcInout, example);
            if (i > 0) {
                Map<String, String> data = new HashMap<>();
                data.put("dataId", zcInout.getInoutNo().toString());
                return ResultVO.success(data);
            } else {
                // 该资产不存在
                return ResultVO.fail(errorCode.ASSETNOTEXIT_ERROR);
            }
        } else {
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 归还资产信息
     *
     * @param inoutNo 资产归还信息id
     * @return
     */
    @Override
    public ResultVO returnCirculate(Integer inoutNo) {

        if (null != inoutNo) {
            ZcInout zcInout = zcInoutMapper.selectByPrimaryKey(inoutNo);

            if (zcInout != null) {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

                ZcInout updateZcInout = new ZcInout();
                updateZcInout.setInoutNo(inoutNo);
                updateZcInout.setBackTime(df.format(new Date()));

                int i = zcInoutMapper.updateByPrimaryKeySelective(updateZcInout);

                Map<String, String> data = new HashMap<>();
                data.put("dataId", inoutNo.toString());
                return ResultVO.success(data);

            } else {
                // 该资产借出记录不存在
                return ResultVO.fail(errorCode.CIRCULATENOTEXIT_ERROR);
            }
        } else {
            // 参数错误 inoutNo为null
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 添加资产的借出记录
     *
     * @param zcInout 资产借出信息
     * @return
     */
    @Override
    public ResultVO insertCirculate(ZcInout zcInout) {
        if (null!=zcInout && !StringUtils.isEmpty(zcInout.getComployeeNo()) && !StringUtils.isEmpty(zcInout.getZcId())) {
            ZcInout dbZcInout = zcInoutMapper.selectByPrimaryKey(zcInout.getInoutNo());
            ZcInfo zcInfo = zcInfoMapper.selectByPrimaryKey(zcInout.getZcId());
            Comployee comployee = comployeeMapper.selectByPrimaryKey(zcInout.getComployeeNo());

            if (dbZcInout != null){
                // 资产借出记录信息已存在
                return ResultVO.fail(errorCode.CIRCULATEISEXIT_ERROR);
            }else if (zcInfo == null) {
                // 资产信息不存在
                return ResultVO.fail(errorCode.ASSETNOTEXIT_ERROR);
            }else if (comployee == null){
                // 员工信息不存在
                return ResultVO.fail(errorCode.COMPLOYEENOTEXIT_ERROR);
            }else {

                SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

                if (zcInout.getOutTime() == null) {
                    zcInout.setOutTime(df.format(new Date()));
                }

                int insert = zcInoutMapper.insertSelective(zcInout);

                Map<String, String> data = new HashMap<>(2);
                data.put("dataId", zcInout.getInoutNo().toString());
                return ResultVO.success(data);
            }

        } else {
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 根据conditions进行搜索
     *
     * @param conditions
     * @return
     */
    @Override
    public ResultVO searchCirculateWithConditions(ZcInout conditions, Integer page, Integer size) {
        if (conditions == null || page == null || size == null) {
            // 参数有误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        } else {
            // TODO 待优化 if else
            ZcInoutExample example = new ZcInoutExample();
            ZcInoutExample.Criteria criteria = example.createCriteria();
            boolean isEmpty = true;
//            if (!StringUtils.isEmpty(conditions.getInoutNo())) {
//                criteria.andZcIdEqualTo(conditions.getInoutNo());
//                isEmpty = false;
//            }
                if (!StringUtils.isEmpty(conditions.getZcId())) {
                    criteria.andZcIdEqualTo(conditions.getZcId());
                    isEmpty = false;
                }
                if (!StringUtils.isEmpty(conditions.getComployeeNo())) {
                    criteria.andComployeeNoEqualTo(conditions.getComployeeNo());
                    isEmpty = false;
                }
                if (isEmpty) {
                    // 无匹配的内容
                    return ResultVO.fail(errorCode.NOMATCHINGCONTENT_ERROR);
                }
                // 分页查询
                RowBounds rowBounds = new RowBounds((page - 1) * size, size);
                long totalNum = zcInoutMapper.countByExample(example);

                List<ZcInout> ZcInouts = zcInoutMapper.selectByExampleWithRowbounds(example, rowBounds);
                PageDTO pageDTO = new PageDTO(ZcInouts, page, (int) totalNum, size);

                return ResultVO.success(pageDTO);
            }

        }

}