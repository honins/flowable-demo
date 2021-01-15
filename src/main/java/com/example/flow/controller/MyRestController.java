package com.example.flow.controller;

import com.example.flow.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by hy
 * @date on 2020/12/18 11:19
 */
@RestController
public class MyRestController {

    @Autowired
    private MyService myService;

    @GetMapping(value = "/test")
    public void test() {
        myService.test();
    }

}