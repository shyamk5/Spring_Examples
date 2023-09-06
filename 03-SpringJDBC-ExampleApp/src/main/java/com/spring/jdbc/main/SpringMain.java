package com.spring.jdbc.main;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmployeeDAO;
import com.spring.jdbc.model.Employee;

public class SpringMain {
	public static void main(String[] args) {
		
		//get the springContext
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//get the EmployeeDAO bean
		EmployeeDAO employeeDAO = ctx.getBean("employeeDAO", EmployeeDAO.class);
		
		//Run some tests
		Employee emp = new Employee();
		int rand = new Random().nextInt(5000);
		emp.setEid(rand);
		emp.setName("Pawan");
		emp.setCity("Kolkata");
		emp.setProfile("Backend Engineer");
		
		//create
		//employeeDAO.save(emp);
		
		Employee emp1 = employeeDAO.getById(2004);
		System.out.println("Retrieved Employee Details:: "+emp1);
	}
}
