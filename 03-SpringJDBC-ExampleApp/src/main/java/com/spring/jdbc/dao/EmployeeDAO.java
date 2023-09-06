package com.spring.jdbc.dao;

import com.spring.jdbc.model.Employee;

public interface EmployeeDAO {
	
	//create
	public void save(Employee emp);
	
	//read
	public Employee getById(int id);
	
}
