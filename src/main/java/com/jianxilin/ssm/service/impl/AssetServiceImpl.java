package com.jianxilin.ssm.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.jianxilin.ssm.dao.ZcInfoMapper;
import com.jianxilin.ssm.dto.PageDTO;
import com.jianxilin.ssm.entity.ZcInfo;
import com.jianxilin.ssm.entity.ZcInfoExample;
import com.jianxilin.ssm.enums.errorCode;
import com.jianxilin.ssm.service.AssetService;
import com.jianxilin.ssm.vo.ResultVO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JianxiLin
 * @date 6.23 - 8:16
 */
@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    ZcInfoMapper zcInfoMapper;

    /**
     * 分页获取资产信息
     *
     * @param page 页码
     * @param size 每页显示的数量
     * @return
     */
    @Override
    public ResultVO getAssetList(Integer page, Integer size) {

        if (null != page && null != size && page >= 0 && size >= 0) {
            // 获取总页数
            long totalNum = zcInfoMapper.countByExample(new ZcInfoExample());
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
                ZcInfoExample zcInfoExample = new ZcInfoExample();
                List<ZcInfo> zcInfos = zcInfoMapper.selectByExampleWithRowbounds(zcInfoExample, rowBounds);

                pageDTO = new PageDTO(zcInfos, page, (int) totalNum, size);

                return ResultVO.success(pageDTO);
            }

        } else {
            // 参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 获取单个资产信息
     *
     * @param assetId 资产id
     * @return
     */
    @Override
    public ResultVO getAsset(String assetId) {
        if (!StringUtils.isEmpty(assetId)) {
            ZcInfo zcInfo = zcInfoMapper.selectByPrimaryKey(assetId);
            return ResultVO.success(zcInfo);
        } else {
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 修改资产信息
     *
     * @param zcInfo
     * @return
     */
    @Override
    public ResultVO updateAsset(ZcInfo zcInfo) {

        ZcInfo dbZcInfo = zcInfoMapper.selectByPrimaryKey(zcInfo.getZcId());
        if (null != dbZcInfo && null != dbZcInfo.getZcId()) {
            BeanUtils.copyProperties(zcInfo, dbZcInfo);
            ZcInfoExample example = new ZcInfoExample();
            example.createCriteria().andZcIdEqualTo(zcInfo.getZcId());
            int i = zcInfoMapper.updateByExampleSelective(dbZcInfo, example);
            if (i > 0) {
                Map<String, String> data = new HashMap<>();
                data.put("dataId", zcInfo.getZcId());
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
     * 删除某个资产信息
     *
     * @param assetId 资产id
     * @return
     */
    @Override
    public ResultVO deleteAsset(String assetId) {

        if (!StringUtils.isEmpty(assetId)) {
            ZcInfo zcInfo = zcInfoMapper.selectByPrimaryKey(assetId);
            if (zcInfo != null) {
                int i = zcInfoMapper.deleteByPrimaryKey(assetId);

                Map<String, String> data = new HashMap<>();
                data.put("dataId", assetId);
                return ResultVO.success(data);

            } else {
                // 该资产不存在
                return ResultVO.fail(errorCode.ASSETNOTEXIT_ERROR);
            }
        } else {
            // 参数错误 assetId为null
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 添加单个资产信息
     *
     * @param zcInfo 资产信息
     * @return
     */
    @Override
    public ResultVO insertAsset(ZcInfo zcInfo) {
        if (null != zcInfo && null != zcInfo.getZcId()) {
            ZcInfo dbZcInfo = zcInfoMapper.selectByPrimaryKey(zcInfo.getZcId());
            if (dbZcInfo == null) {

                int insert = zcInfoMapper.insertSelective(zcInfo);

                Map<String, String> data = new HashMap<>(2);
                data.put("dataId", zcInfo.getZcId());
                return ResultVO.success(data);

            } else {
                return ResultVO.fail(errorCode.ASSETOFINSERTISEXIT_ERROR);
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
    public ResultVO searchAssetWithConditions(ZcInfo conditions, Integer page, Integer size) {
        if (conditions == null || page == null || size == null) {
            // 参数有误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        } else {
            // TODO 待优化 if else
            ZcInfoExample example = new ZcInfoExample();
            ZcInfoExample.Criteria criteria = example.createCriteria();
            boolean isEmpty = true;
            if (!StringUtils.isEmpty(conditions.getZcId()) ) {
                criteria.andZcIdEqualTo(conditions.getZcId());
                isEmpty = false;
            }
            if (!StringUtils.isEmpty(conditions.getZcNo())) {
                criteria.andZcNoEqualTo(conditions.getZcNo());
                isEmpty = false;
            }
            if (!StringUtils.isEmpty(conditions.getZcName())) {
                criteria.andZcNameEqualTo(conditions.getZcName());
                isEmpty = false;
            }
            if (!StringUtils.isEmpty(conditions.getZcFactory())) {
                criteria.andZcFactoryEqualTo(conditions.getZcFactory());
                isEmpty = false;
            }
            if (!StringUtils.isEmpty(conditions.getZcBuyer())) {
                criteria.andZcBuyerEqualTo(conditions.getZcBuyer());
                isEmpty = false;
            }
            if (!StringUtils.isEmpty(conditions.getZcType())) {
                criteria.andZcTypeEqualTo(conditions.getZcType());
                isEmpty = false;
            }
            if (!StringUtils.isEmpty(conditions.getZcStatus())) {
                criteria.andZcStatusEqualTo(conditions.getZcStatus());
                isEmpty = false;
            }
            if(isEmpty){
                // 无匹配的内容
                return ResultVO.fail(errorCode.NOMATCHINGCONTENT_ERROR);
            }
            // 分页查询
            RowBounds rowBounds = new RowBounds((page - 1) * size,size);
            long totalNum = zcInfoMapper.countByExample(example);

            List<ZcInfo> zcInfos = zcInfoMapper.selectByExampleWithRowbounds(example, rowBounds);
            PageDTO pageDTO = new PageDTO(zcInfos, page, (int) totalNum, size);

            return ResultVO.success(pageDTO);
        }

    }
}
