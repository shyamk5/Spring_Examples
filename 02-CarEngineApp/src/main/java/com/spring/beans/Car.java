package com.spring.beans;

public class Car {
	
	private IEngine eng;
	
	public Car() {
		System.out.println("Car() 0-param Constructor");
	}
	
	public Car(IEngine eng) {
		System.out.println("Car() param Constructor");
		this.eng = eng;
	}
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		//logic
		int status = eng.start();
		
		if(status==1)
			System.out.println("Journey Started...");
		else
			System.out.println("Engine Trouble...");
	}
}
