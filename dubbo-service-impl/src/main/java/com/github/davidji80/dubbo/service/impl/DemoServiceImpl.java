package com.github.davidji80.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.davidji80.dubbo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
