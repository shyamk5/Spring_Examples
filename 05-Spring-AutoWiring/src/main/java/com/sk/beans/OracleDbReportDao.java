package com.sk.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OracleDbReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from Oracle DB...");
		
	}
	
	

}
