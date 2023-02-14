package com.insrb.micro.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * root 컨트롤러
 * 어드민 요청 들어옴
 */

@Controller
public class RootController {

    @GetMapping(path = "/test")
    public String test(){
        return "login/login";
    }
}
