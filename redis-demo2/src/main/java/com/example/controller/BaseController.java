package com.example.controller;

import com.example.config.RedisConn;
import com.example.config.RedisUtil;
import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BaseController {

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private RedisConn redisConn;

    @GetMapping("/success")
    String successPage(){
        redisUtil.set("user",new User("1","username","password"));
        return "success";
    }

    @GetMapping("/getUser")
    @ResponseBody
    Object getUser(){
        return redisUtil.get("user");
    }


    /**
     * 获取RedisConn对象属性值
     * @return
     */
    @GetMapping("/getRedisConn")
    @ResponseBody
    Object getRedisConn(){
        return redisConn;
    }
}
