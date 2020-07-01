package com.jianxilin.ssm.web;

import com.jianxilin.ssm.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author JianxiLin
 * @date 4.28 - 20:41
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexPage(){
        // 如果session中有用户信息，跳转到首页 index
        // 没有则跳转到 登录页面 login

//        return "index";
        return "login";
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(Model model,
                        UserInfo userInfo){

        return "index";
    }
}
