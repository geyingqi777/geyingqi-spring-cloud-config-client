package com.geyingqi.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot项目的hello world
 * <p>
 * Created by geyingqi on 2019-03-24 16:47.
 */
@RestController
@RequestMapping(value = "hello")
public class HelloWorldController {
    @Value("${geyingqi.name}")
    private String value;

    @RequestMapping(value = "world")
    public String index() {
        System.out.println("获取到的配置值geyingqi.name:" + value);
        return "hello world:" + value;
    }
}
