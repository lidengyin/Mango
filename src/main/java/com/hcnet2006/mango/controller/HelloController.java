package com.hcnet2006.mango.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "hello信息接口")
@RestController
@RequestMapping("/hello")
public class HelloController {
    @ApiOperation(value = "你好ubuntu接口",notes = "你好ubuntu接口")
    @GetMapping("/everyone")
    public String helloEveryone(){
        return "Hello Ubuntu";
    }
}
