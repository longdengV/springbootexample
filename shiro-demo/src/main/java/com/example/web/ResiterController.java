package com.example.web;

import com.example.model.UserInfo;
import com.example.model.UserVo;
import com.example.sevice.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class ResiterController {

    @Resource
    private UserInfoService userInfoService;

    /**
     * 提交注册信息
     * @return
     */
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String registerPost(UserVo userVo){
        /*
        1.检验数据合法性（可以在拦截器中去做）
        2.检验数据用户信息是否存在
         */
        UserInfo user = userInfoService.findByUsername(userVo.getUsername());
        if( user != null ){
            System.out.println("当前用户存在了，那么重新输入信息");
            return "register";
        }
        userInfoService.register(userVo);
        return "login";
    }
    /**
     * 注册页面
     * @return
     */
    @GetMapping("/register")
    public String register(){
        return "register";
    }

}
