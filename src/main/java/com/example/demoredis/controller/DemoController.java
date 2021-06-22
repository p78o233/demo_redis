package com.example.demoredis.controller;

import com.example.demoredis.entity.Test;
import com.example.demoredis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author p78o2
 * @date 2021/6/21
 */
@RestController
@RequestMapping(value = "/redis")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping(value = "/set")
    public void set(){
        Test test = new Test(1,"p78o2");
        demoService.set("p78o2",test);
    }

    @GetMapping(value = "/get")
    public Test get(){
        return (Test)demoService.get("p78o2");
    }
}
