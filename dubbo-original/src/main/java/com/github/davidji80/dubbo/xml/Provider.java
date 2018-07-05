package com.github.davidji80.dubbo.xml;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"spring/application-provider.xml"});
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}