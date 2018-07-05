package com.github.davidji80.dubbo.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.github.davidji80.dubbo.service.DemoService;
import com.github.davidji80.dubbo.providerimpl.DemoServiceImpl;


import java.io.IOException;

public class ProviderAPI {
	public static void main(String[] args) throws IOException {
		// 服务实现
		DemoService demoService=new DemoServiceImpl();

		// 当前应用配置
		ApplicationConfig applicationConfig=new ApplicationConfig();
		applicationConfig.setName("demo-provider");

		// 连接注册中心配置
		RegistryConfig registry = new RegistryConfig();
		registry.setAddress("zookeeper://192.168.1.7:2181");

		// 服务提供者协议配置
		ProtocolConfig protocol = new ProtocolConfig();
		protocol.setName("dubbo");
		protocol.setPort(20880);

		// 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口

		// 服务提供者暴露服务配置
		ServiceConfig<DemoService> service = new ServiceConfig<DemoService>(); // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
		service.setApplication(applicationConfig);
		service.setRegistry(registry); // 多个注册中心可以用setRegistries()
		service.setProtocol(protocol); // 多个协议可以用setProtocols()
		service.setInterface(DemoService.class);
		service.setRef(demoService);
		service.setVersion("1.0.0");

		// 暴露及注册服务
		service.export();

		System.out.println("按任意键退出");
		System.in.read();
	}
}