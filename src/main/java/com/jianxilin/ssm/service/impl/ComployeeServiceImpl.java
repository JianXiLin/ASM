package com.jianxilin.ssm.service.impl;

import com.jianxilin.ssm.dao.ComployeeMapper;
import com.jianxilin.ssm.dto.PageDTO;
import com.jianxilin.ssm.entity.Comployee;
import com.jianxilin.ssm.entity.ComployeeExample;
import com.jianxilin.ssm.enums.errorCode;
import com.jianxilin.ssm.service.ComployeeService;
import com.jianxilin.ssm.vo.ResultVO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JianxiLin
 * @date 4.29 - 10:23
 */
@Service
public class ComployeeServiceImpl implements ComployeeService {

    @Autowired
    private ComployeeMapper comployeeMapper;

    /**
     * 获取分页的数据集
     * @param page 页码
     * @param size 每页大小
     * @return
     */
    @Override
    public ResultVO getComployeeList(Integer page, Integer size) {

        if (null != page && null != size && page >= 0 && size >= 0) {
            // 获取总页数
            long totalNum = comployeeMapper.countByExample(new ComployeeExample());
            if ( (page-1) * size >= totalNum){
                return ResultVO.fail(errorCode.OUTOFPAGESIZE_ERROR);
            }else{
                PageDTO pageDTO = null ;
                // 分页查询的参数 偏移的位置（起始位置）
                Integer offset = (page - 1) * size;
                // 单页的数量
                Integer limit = size;
                // 获取结果集
                RowBounds rowBounds = new RowBounds(offset, limit);
                ComployeeExample example = new ComployeeExample();
                List<Comployee> comployees = comployeeMapper.selectByExampleWithRowbounds(example, rowBounds);

                pageDTO = new PageDTO(comployees,page, (int) totalNum,size);

                return ResultVO.success(pageDTO);
            }
        } else {
            //失败,参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 获取某员工信息
     * @param comployeeNo
     * @return
     */
    @Override
    public ResultVO getComployee(String comployeeNo) {
        if (comployeeNo != null){
            Comployee comployee = comployeeMapper.selectByPrimaryKey(comployeeNo);
            if(comployee != null){
                return ResultVO.success(comployee);
            }else{
                //改员工不存在
                return ResultVO.fail(errorCode.COMPLOYEENOTEXIT_ERROR);
            }
        }else{
            //失败,参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 修改员工信息
     * @param comployee
     * @return
     */
    @Override
    public ResultVO updateComployee(Comployee comployee) {
        if (comployee != null){
            int result = comployeeMapper.updateByPrimaryKeySelective(comployee);
            if (result > 0){

                Map<String,String> data = new HashMap<>();
                data.put("dataId",comployee.getComployeeNo());
                data.put("operation","update");
                data.put("range","comployee");
                return ResultVO.success(data);
            }
            return ResultVO.fail(errorCode.COMPLOYEENOTEXIT_ERROR);
        }else{
            //失败,参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 删除员工
     * @param comployeeNo
     * @return
     */
    @Override
    public ResultVO deleteComployee(String comployeeNo) {
        if (comployeeNo != null){
            Comployee comployeeDB = comployeeMapper.selectByPrimaryKey(comployeeNo);
            if(comployeeDB!=null){
                int i = comployeeMapper.deleteByPrimaryKey(comployeeNo);

                Map<String,String> data = new HashMap<>();
                data.put("dataId",comployeeNo);
                data.put("operation","delete");
                data.put("range","comployee");
                return ResultVO.success(data);
            }else {
                //错误，该员工不存在
                return ResultVO.fail(errorCode.COMPLOYEENOTEXIT_ERROR);
            }
        }else{
            //失败,参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

    /**
     * 添加员工
     * @param comployee
     * @return
     */
    @Override
    public ResultVO insertComployee(Comployee comployee) {
        if(comployee !=null){
            Comployee comployeeInDB = comployeeMapper.selectByPrimaryKey(comployee.getComployeeNo());
            if(comployeeInDB ==null){
                comployeeMapper.insertSelective(comployee);

                Map<String,String> data = new HashMap<>();
                data.put("dataId",comployee.getComployeeNo());
                data.put("operation","createComployee");
                data.put("range","comployee");
                return ResultVO.success(data);
            }else {
                //错误，该新增员工已经存在
                return ResultVO.fail(errorCode.COMPLOYEEOFINSERTISEXIT_ERROR);
            }
        }else {
            //失败,参数错误
            return ResultVO.fail(errorCode.PARAM_ERROR);
        }
    }

}
