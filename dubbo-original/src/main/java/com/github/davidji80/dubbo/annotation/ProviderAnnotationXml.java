package com.github.davidji80.dubbo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class ProviderAnnotationXml {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"spring/annotation-provider.xml"});
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}