package com.r.advanced;

public class ReturnExample {

	public static void main(String[] args) {
		
		System.out.println(methodReturningValue());
	}
	public static int methodReturningValue() {
		try {
			System.out.println("try block");
			return 10/0;
		}
		catch(Exception e) {
			System.out.println("catch block");
			return 20;
		}
	}

}
