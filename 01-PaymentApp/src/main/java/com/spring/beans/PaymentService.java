package com.spring.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
		System.out.println("PaymentService():: param-Constructor");
	}
	
	public PaymentService() {
		System.out.println("PaymentService():: 0-Constructor");
	}
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
		System.out.println("PaymentService.setPayment()");
	}
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		
		if(status) {
			System.out.println("Receipt Printing....");
		}
		else {
			System.out.println("Card Declined....");
		}
	}
}
