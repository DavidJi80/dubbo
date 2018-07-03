package com.github.davidji80.dubbo.consumer.controller;

import com.github.davidji80.dubbo.service.DemoService;
import com.reger.dubbo.annotation.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {
    @Inject
    DemoService demoService;

    @RequestMapping("helloDubbo")
    public String helloDubbo() {

        return demoService.sayHello("dubbo");
    }
}
