package com.jianxilin.ssm.service;

import com.jianxilin.ssm.entity.ZcInout;
import com.jianxilin.ssm.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * @author JianxiLin
 * @date 6.23 - 8:11
 */
@Service
public interface CirculateService {


    /**
     * 查询所有借还信息
     * @return
     */
    ResultVO getCirculateList(Integer page, Integer size);

    /**
     * 获取单个借还信息
     * @param inoutNo
     * @return
     */
    ResultVO getCirculate(Integer inoutNo);

    /**
     * 修改资产信息
     * @param zcInout
     * @return
     */
    ResultVO updateCirculate(ZcInout zcInout);

    /**
     * 删除某资产信息
     * @param inoutNo
     * @return
     */
    ResultVO returnCirculate(Integer inoutNo);

    /**
     * 添加资产
     * @param zcInout
     * @return
     */
    ResultVO insertCirculate(ZcInout zcInout);

    /**
     * 根据搜索条件进行搜索
     * @return
     */
    ResultVO searchCirculateWithConditions(ZcInout conditions, Integer page, Integer size);
}
