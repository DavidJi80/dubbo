package com.github.davidji80.dubbo.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderProperties {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"properties-provider.xml"});
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}