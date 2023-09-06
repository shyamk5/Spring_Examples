package com.spring.beans;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine() 0-param Constructor");
	}
	
	@Override
	public int start() {
		//logic
		System.out.println("DieselEngine Started...");
		return 1;
	}

}
