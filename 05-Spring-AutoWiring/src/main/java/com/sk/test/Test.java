package com.sk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.AppConfig;
import com.sk.service.ReportService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService service = ctx.getBean(ReportService.class);
		service.generateReport();
		
	}
	
}
