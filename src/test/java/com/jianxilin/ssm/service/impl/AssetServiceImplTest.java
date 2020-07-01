package com.jianxilin.ssm.service.impl;

import com.jianxilin.ssm.dao.ZcInfoMapper;
import com.jianxilin.ssm.dto.PageDTO;
import com.jianxilin.ssm.entity.ZcInfo;
import com.jianxilin.ssm.entity.ZcInfoExample;
import com.jianxilin.ssm.service.AssetService;
import com.jianxilin.ssm.service.ComployeeService;
import com.jianxilin.ssm.vo.ResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author JianxiLin
 * @date 6.23 - 15:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class AssetServiceImplTest {
    
    @Autowired
    AssetService assetService;
    @Autowired
    ComployeeService comployeeService;
    @Autowired
    ZcInfoMapper zcInfoMapper;
    
    @Test
    public void getAssetList() {
        ResultVO resultVO = assetService.getAssetList(1, 5);
        PageDTO data = (PageDTO) resultVO.getData();
        List pageItems = data.getPageItems();

        pageItems.forEach(e->{
            System.out.println(((ZcInfo) e).toString());
        });
    }

    @Test
    public void getAsset() {

        ResultVO asset = assetService.getAsset("C2KS@_1");
        ZcInfo data = (ZcInfo) asset.getData();
        System.out.println(data.toString());

    }

    @Test
    public void updateAsset() {
        ResultVO resultVO = assetService.getAsset("C2KS@_1");
        ZcInfo zcInfo = (ZcInfo) resultVO.getData();
        System.out.println(zcInfo.toString());

        zcInfo.setZcProducetime("2007-12-30");
        ResultVO resultVO1 = assetService.updateAsset(zcInfo);
    }

    @Test
    public void deleteAsset() {
        ResultVO resultVO = assetService.deleteAsset("1");
    }

    @Test
    public void insertAsset() {
        ZcInfo zcInfo = new ZcInfo();
        zcInfo.setZcId("1");
        zcInfo.setZcNo("no");
        zcInfo.setZcName("山特");
        zcInfo.setZcPrice(1500f);
        zcInfo.setZcBuyer("Buyer");
        zcInfo.setZcFactory("factory");
//        zcInfo.setZcStatus("status");
//        zcInfo.setZcType("type");
        ResultVO resultVO = assetService.insertAsset(zcInfo);

    }

    @Test
    public void select(){
        ZcInfoExample example = new ZcInfoExample();
        ZcInfoExample.Criteria criteria = example.createCriteria();
//        criteria.andZcBuytimeEqualTo();
//        criteria.andZcIdEqualTo();

        zcInfoMapper.selectByExample(example);

    }
}