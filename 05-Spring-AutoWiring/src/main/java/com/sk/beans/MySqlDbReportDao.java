package com.sk.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDbReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from MySQL DB...");
		
	}
	
}
