package com.geyingqi.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot项目的hello world
 * <p>
 * Created by geyingqi on 2019-03-24 16:47.
 */
@RestController
@RequestMapping(value = "hello")
// 支持手动刷新从config server读取的配置的注解,调用http://xxxx/refresh手动刷新配置
@RefreshScope
public class HelloWorldController {
    @Value("${geyingqi.name}")
    private String value;

    @RequestMapping(value = "world")
    public String index() {
        System.out.println("获取到的配置值geyingqi.name:" + value);
        return "hello world:" + value;
    }
}
