package com.github.davidji80.dubbo.annotation.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.davidji80.dubbo.service.DemoService;
import org.springframework.stereotype.Component;


@Component("demoAction")
public class DemoAnnotationAction {

    @Reference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }

}
