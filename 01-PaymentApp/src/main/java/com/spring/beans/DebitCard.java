package com.spring.beans;

public class DebitCard implements IPayment {

	public DebitCard() {
		System.out.println("DebitCard.DebitCard() constructor");
	}
	
	@Override
	public boolean processPayment(double billAmt) {
		//logic
		
		System.out.println("Processing payment with Debit Card for Bill Amount "+billAmt);
		return true;
	}
	
}
