package com.jianxilin.ssm.web;

import com.jianxilin.ssm.entity.ZcInfo;
import com.jianxilin.ssm.service.AssetService;
import com.jianxilin.ssm.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @author JianxiLin
 * @date 6.22 - 23:23
 */
@Controller
@RequestMapping("/assets")
public class AssetController {

    @Autowired
    AssetService assetService;

    /**
     * 分页获取资产信息
     * @param page
     * @param size
     * @param model
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String list(@RequestParam(value = "page",defaultValue ="1") Integer page,
                       @RequestParam(value = "size",defaultValue = "5") Integer size,
                       Model model){
        ResultVO resultVO = assetService.getAssetList(page, size);
        model.addAttribute("resultVO",resultVO);

        return "asset";
    }

    /***
     * 跳转到添加资产页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/page/create",method = RequestMethod.GET)
    public String toPageForAdd(Model model){
        model.addAttribute("resultVO",ResultVO.success());
        return "modifyAsset";
    }

    /**
     * 添加资产
     * @param zcInfo
     * @param model
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String add(ZcInfo zcInfo,Model model){
        ResultVO resultVO = assetService.insertAsset(zcInfo);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("range","assets");
        model.addAttribute("operation","create");
        return "state";
    }

    /**
     * 获取修改各个资产的页面
     * @param model
     * @param assetId
     * @return
     */
    @RequestMapping(value = "/page/modify/{assetId}",method = RequestMethod.GET)
    public String getComployee(Model model,
                               @PathVariable("assetId") String assetId){
        ResultVO resultVO = assetService.getAsset(assetId);
        model.addAttribute("resultVO",resultVO);

        return "modifyAsset";
    }

    /**
     * 修改资产
     * @param zcInfo
     * @param model
     * @return
     */
    @RequestMapping(value = "{zcId}",method = RequestMethod.PUT)
    public String update(ZcInfo zcInfo,
                         @PathVariable String zcId,
                         Model model){

        ResultVO resultVO = assetService.updateAsset(zcInfo);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("range","assets");
        model.addAttribute("operation","update");
        return "state";
    }

    /**
     * 删除资产
     * @param assetId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{assetId}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable("assetId") String assetId){

        ResultVO resultVO = assetService.deleteAsset(assetId);

        return resultVO;
    }

    @RequestMapping(value = "/page/search",method = RequestMethod.GET)
    public String toSearchPage(){
        return "searchAsset";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String search(ZcInfo conditions,Model model,
                         @RequestParam(value = "page",defaultValue ="1") Integer page,
                         @RequestParam(value = "size",defaultValue = "5") Integer size){

        ResultVO resultVO = assetService.searchAssetWithConditions(conditions,page,size);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("conditions",conditions);

        return "searchAsset";
    }



}
