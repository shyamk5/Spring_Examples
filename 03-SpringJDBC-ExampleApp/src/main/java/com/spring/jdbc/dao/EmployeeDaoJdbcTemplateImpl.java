package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.model.Employee;

public class EmployeeDaoJdbcTemplateImpl implements EmployeeDAO {

	private DataSource datasource;
	

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void save(Employee emp) {
		
		String query = "insert into emp(eid,name,city,profile)values(?,?,?,?)";
		
		JdbcTemplate template = new JdbcTemplate(datasource);
		
		Object[] args = new Object[] {emp.getEid(), emp.getName(), emp.getCity(), emp.getProfile()};
		
		int result = template.update(query, args);
		
		if(result != 0)
			System.out.println("Employee Saved with id::"+emp.getEid());
		else
			System.out.println("Employee data Save failed...");
		
		
	}//save

	@Override
	public Employee getById(int id) {
		String query = "select eid,name,city,profile from emp where eid=?";
		JdbcTemplate template = new JdbcTemplate(datasource);
		
		@SuppressWarnings("deprecation")
		Employee emp = template.queryForObject(query, new Object[] {id}, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Employee emp = new Employee();
				emp.setEid(rs.getInt("eid"));
				emp.setName(rs.getString("name"));
				emp.setCity(rs.getString("city"));
				emp.setProfile(rs.getString("profile"));
				return emp;
				
			
			}});
		return emp;
	}//getById
}//class
