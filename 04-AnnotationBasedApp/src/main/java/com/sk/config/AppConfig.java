package com.sk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sk, com.tcs")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig()::Constructor");
	}
	
}
