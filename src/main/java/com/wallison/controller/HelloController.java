package com.wallison.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public @ResponseBody String hello() {
        return "Hello!";
    }

}
