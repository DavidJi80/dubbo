package com.github.davidji80.dubbo.annotation;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.github.davidji80.dubbo.annotation.action.DemoAnnotationAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class ConsumerAnnotation {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final DemoAnnotationAction annotationAction = (DemoAnnotationAction) context.getBean("demoAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println("result :" + hello);
        System.in.read();
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.github.davidji80.dubbo.annotation.action")
    @PropertySource("classpath:/dubbo.properties")
    @ComponentScan(value = {"com.github.davidji80.dubbo.annotation.action"})
    static public class ConsumerConfiguration {

    }
}
