package com.example.nginxController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NginxController {

    @RequestMapping(value="nginx",method = RequestMethod.GET)
    String page(){

        return "nginx";
    }
}
