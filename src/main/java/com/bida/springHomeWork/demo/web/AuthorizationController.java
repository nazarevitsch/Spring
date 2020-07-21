package com.bida.springHomeWork.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizationController {

    @GetMapping("/authorization")
    public String getAuthorizationPage(){
        return("authorization");
    }
}
