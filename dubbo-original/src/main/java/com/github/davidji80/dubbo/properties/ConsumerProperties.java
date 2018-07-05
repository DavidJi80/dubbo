package com.github.davidji80.dubbo.properties;

import com.github.davidji80.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerProperties {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"properties-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
        System.out.println("按任意键退出");
        System.in.read();
    }
}
