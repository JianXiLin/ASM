package com.jianxilin.ssm.service;

import com.jianxilin.ssm.entity.ZcInfo;
import com.jianxilin.ssm.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * @author JianxiLin
 * @date 6.23 - 8:11
 */
@Service
public interface AssetService {


    /**
     * 查询所有资产的信息
     * @return
     */
    ResultVO getAssetList(Integer page, Integer size);

    /**
     * 获取单个资产的信息
     * @param assetId
     * @return
     */
    ResultVO getAsset(String assetId);

    /**
     * 修改资产信息
     * @param zcInfo
     * @return
     */
    ResultVO updateAsset(ZcInfo zcInfo);

    /**
     * 删除某资产信息
     * @param assetId
     * @return
     */
    ResultVO deleteAsset(String assetId);

    /**
     * 添加资产
     * @param zcInfo
     * @return
     */
    ResultVO insertAsset(ZcInfo zcInfo);

    /**
     * 根据搜索条件进行搜索
     * @return
     */
    ResultVO searchAssetWithConditions(ZcInfo conditions,Integer page, Integer size);
}
