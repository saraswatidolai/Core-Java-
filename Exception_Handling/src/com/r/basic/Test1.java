package com.r.basic;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException e) {
			System.err.println("Divide by zero Problem");
		}
		System.out.println("Completed");
	}
}
