package com.github.davidji80.dubbo.providerimpl;

import com.github.davidji80.dubbo.service.DemoService;


public class DemoServiceGroupImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello Group " + name;
    }
}
