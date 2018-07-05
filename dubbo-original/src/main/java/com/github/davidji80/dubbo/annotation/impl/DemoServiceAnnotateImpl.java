package com.github.davidji80.dubbo.annotation.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.davidji80.dubbo.service.DemoService;

@Service
public class DemoServiceAnnotateImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello Annotate " + name;
    }
}
