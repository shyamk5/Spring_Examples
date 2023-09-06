package com.spring.jdbc.model;

public class Employee {
	
	private int eid;
	private String name;
	private String city;
	private String profile;
	
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProfile() {
		return profile;
	}
	
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", city=" + city + ", profile=" + profile + "]";
	}
	
	
}
