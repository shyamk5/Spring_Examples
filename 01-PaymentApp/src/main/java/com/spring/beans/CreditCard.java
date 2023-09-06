package com.spring.beans;

public class CreditCard implements IPayment {

	public CreditCard() {
		System.out.println("CreditCard.CreditCard() constructor");
	}
	
	@Override
	public boolean processPayment(double billAmt) {
		//logic
		
		System.out.println("Processing payment with Credit Card for Bill Amount "+billAmt);
		return true;
	}

}
