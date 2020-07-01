package com.jianxilin.ssm.service;

import com.jianxilin.ssm.entity.Comployee;
import com.jianxilin.ssm.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * @author JianxiLin
 * @date 4.29 - 10:22
 */
@Service
public interface ComployeeService {

    /**
     * 查询所有员工的信息
     * @return
     */
    ResultVO getComployeeList(Integer page, Integer size);

    /**
     * 获取单个员工的信息
     * @param comployeeNo
     * @return
     */
    ResultVO getComployee(String comployeeNo);

    /**
     * 修改员工信息
     * @param comployee
     * @return
     */
    ResultVO updateComployee(Comployee comployee);

    /**
     * 删除某员工信息
     * @param comployeeNo
     * @return
     */
    ResultVO deleteComployee(String comployeeNo);

    /**
     * 添加员工
     * @param comployee
     * @return
     */
    ResultVO insertComployee(Comployee comployee);
}
