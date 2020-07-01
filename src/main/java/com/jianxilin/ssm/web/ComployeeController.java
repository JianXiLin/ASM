package com.jianxilin.ssm.web;


import com.jianxilin.ssm.entity.Comployee;
import com.jianxilin.ssm.service.ComployeeService;
import com.jianxilin.ssm.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author JianxiLin
 *
 */
@CrossOrigin
@Controller
@RequestMapping("/comployee")
public class ComployeeController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private  ComployeeService comployeeService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(){

        return "redirect:/comployee/list";
    }

    /**
     * 获取员工列表
     * @param model
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model,
                       @RequestParam(value="page",defaultValue = "1") Integer page,
                        @RequestParam(value="size",defaultValue = "5") Integer size){

        ResultVO resultVO = comployeeService.getComployeeList(page, size);
        model.addAttribute("resultVO",resultVO);

        return "comployee";
    }

    /**
     * 跳转到单个员工信息页面
     * @param model
     * @param comployeeNo
     * @return
     */
    @RequestMapping(value = "/page/modify/{comployeeNo}",method = RequestMethod.GET)
    public String getComployee(Model model,
                                @PathVariable("comployeeNo") String comployeeNo){
        ResultVO resultVO = comployeeService.getComployee(comployeeNo);
        model.addAttribute("resultVO",resultVO);

        return "modifyComployee";
    }

    /**
     * 修改Comployee
     * @param model
     * @param comployeeNo
     * @return
     */
    @RequestMapping(value = "/{comployeeNo}/update",method = RequestMethod.PUT)
    public String modifyComployee(Model model,
                                  @PathVariable String comployeeNo,
                                  Comployee comployee){
        ResultVO resultVO = comployeeService.updateComployee(comployee);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("range","comployee");
        model.addAttribute("operation","update");
        return "state";
    }


    /**
     * 删除员工
     * @param model
     * @param comployeeNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{comployeeNo}/delete",method = RequestMethod.DELETE)
    public Object deleteComployee(Model model,
                                  @PathVariable("comployeeNo") String comployeeNo){

        ResultVO resultVO = comployeeService.deleteComployee(comployeeNo);

        return resultVO;
    }

    /**
     * 跳转到添加员工页面
     * @return
     */
    @RequestMapping(value = "/page/create",method = RequestMethod.GET)
    public String toPageOfCreate(Model model){

        model.addAttribute("resultVO",ResultVO.success());
        return "modifyComployee";
    }

    /**
     * 新增员工
     * @param model
     * @param comployee
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createComployee(Model model,
                                  Comployee comployee){
        ResultVO resultVO = comployeeService.insertComployee(comployee);
        model.addAttribute("resultVO",resultVO);
        model.addAttribute("range","comployee");
        model.addAttribute("operation","create");
        return "state";
    }




}
