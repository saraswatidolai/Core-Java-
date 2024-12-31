package com.r.data_hiding;

public class BankApplication {
	public static void main(String[] args) {
		Customer scott = new Customer();
		scott.deposite(1000);
		scott.withdraw(5000);
	}
}
