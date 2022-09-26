package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(){
        // mustache 기본폴더 src/main/resources
        // 뷰 리졸버 설정 prefix: /templates/ , suffix: .mustache
        // index.mustache
        return "index";
    }
}
