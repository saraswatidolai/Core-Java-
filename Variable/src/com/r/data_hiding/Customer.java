package com.r.data_hiding;

public class Customer {
	private double balance = 1000; //Data Hiding
	
	public void deposite(double amount) {
		
		if(amount<=0) {
			System.out.println("amount can't be deposited");
		}
		else {
			this.balance = this.balance + amount;
			System.out.println("Amount after deposite is: "+this.balance);
		}
	}
	
	public void withdraw(double amount) {
		
		if(amount>this.balance) {
			System.out.println("Insuffcient balance");
		}
		else {
			this.balance = this.balance - amount;
			System.out.println("Balance after withdraw is: "+this.balance);
		}
	}
}
