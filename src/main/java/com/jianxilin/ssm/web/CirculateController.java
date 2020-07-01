package com.jianxilin.ssm.web;

import com.jianxilin.ssm.entity.ZcInout;
import com.jianxilin.ssm.service.CirculateService;
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
@RequestMapping("/circulates")
public class CirculateController {

    @Autowired
    CirculateService circulateService;

    /**
     * 分页获取借还信息
     * @param page
     * @param size
     * @param model
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String list(@RequestParam(value = "page",defaultValue ="1") Integer page,
                       @RequestParam(value = "size",defaultValue = "5") Integer size,
                       Model model){
        ResultVO resultVO = circulateService.getCirculateList(page, size);
        model.addAttribute("resultVO",resultVO);

        return "circulate";
    }

    /***
     * 跳转到借出登记页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/page/create",method = RequestMethod.GET)
    public String toPageForAdd(Model model){
        model.addAttribute("resultVO", ResultVO.success());
        return "modifyCirculate";
    }

    /**
     * 借出登记
     * @param zcInout
     * @param model
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String add(ZcInout zcInout, Model model){
        ResultVO resultVO = circulateService.insertCirculate(zcInout);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("range","circulates");
        model.addAttribute("operation","create");
        return "state";
    }

    /**
     * 获取修改借还信息的页面
     * @param model
     * @param circulateId
     * @return
     */
    @RequestMapping(value = "/page/modify/{circulateId}",method = RequestMethod.GET)
    public String getComployee(Model model,
                               @PathVariable("circulateId") Integer circulateId){
        ResultVO resultVO = circulateService.getCirculate(circulateId);
        model.addAttribute("resultVO",resultVO);

        return "modifyCirculate";
    }

    /**
     * 修改借还信息
     * @param
     * @param model
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public String update(ZcInout zcInout,
                         Model model){
        ResultVO resultVO = circulateService.updateCirculate(zcInout);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("range","circulates");
        model.addAttribute("operation","update");
        return "state";
    }

    /**
     * 借还资产
     * @param circulateId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/return/{circulateId}",method = RequestMethod.PUT)
    public Object returnAsset(@PathVariable("circulateId") Integer circulateId){

        ResultVO resultVO = circulateService.returnCirculate(circulateId);

        return resultVO;
    }

    @RequestMapping(value = "/page/search",method = RequestMethod.GET)
    public String toSearchPage(){
        return "searchCirculate";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String search(ZcInout conditions, Model model,
                         @RequestParam(value = "page",defaultValue ="1") Integer page,
                         @RequestParam(value = "size",defaultValue = "5") Integer size){

        ResultVO resultVO = circulateService.searchCirculateWithConditions(conditions,page,size);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("conditions",conditions);

        return "searchCirculate";
    }



}
