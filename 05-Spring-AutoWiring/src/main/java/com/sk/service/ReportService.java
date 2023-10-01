package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sk.beans.ReportDao;

@Service
public class ReportService {
	
	@Autowired
	private ReportDao dao;
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated...!");
	}
	
	
}
