package com.github.davidji80.dubbo.xml;

import com.github.davidji80.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/application-consumer.xml"});
        context.start();
        // 获取远程服务代理
        DemoService demoService = (DemoService)context.getBean("demoService2");
        /*// 执行远程方法
        String hello = demoService.sayHello("world");
        // 显示调用结果
        System.out.println( hello );*/
        System.out.println("按任意键退出");
        System.in.read();
    }
}
