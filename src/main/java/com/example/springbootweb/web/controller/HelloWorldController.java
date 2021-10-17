package com.example.springbootweb.web.controller;

import com.example.springbootweb.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author alfred.zhang
 * @date 2021/8/11
 */

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        testService.test();
        return "Hello World!";
    }
}
