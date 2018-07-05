package com.github.davidji80.dubbo.annotation;

import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


public class ProviderAnnotation {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
		context.start();
		System.in.read();
	}

	@Configuration
	@EnableDubbo(scanBasePackages = "com.github.davidji80.dubbo.service.oimpl")
	@PropertySource("classpath:/dubbo.properties")
	static public class ProviderConfiguration {
		@Bean
		public ProviderConfig providerConfig() {
			ProviderConfig providerConfig = new ProviderConfig();
			providerConfig.setTimeout(1000);
			return providerConfig;
		}
	}
}