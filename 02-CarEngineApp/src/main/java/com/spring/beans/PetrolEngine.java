package com.spring.beans;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine() 0-param Constructor");
	}
	
	@Override
	public int start() {
		//logic
		System.out.println("Petrol Engine Started...");
		return 1;
	}

}
