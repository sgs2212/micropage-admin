package com.insrb.micro.admin.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api 요청을 처리하는 컨트롤러
 * @RestController로 처리
 */

@RestController
public class ApiController {

    @GetMapping(path = "/api")
    public String test(){
        return "api 테스트";
    }
}
