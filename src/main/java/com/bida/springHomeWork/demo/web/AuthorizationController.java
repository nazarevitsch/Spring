package com.bida.springHomeWork.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authorization")
public class AuthorizationController {

//    @GetMapping("/authorization")
    @GetMapping
    public String getAuthorizationPage(){
        return("authorization");
    }
}
