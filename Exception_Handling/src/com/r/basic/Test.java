package com.r.basic;

public class Test {
	public static void main(String[] args) {
		try {
			//System.out.println(10/0);   //here try block implicitly create exception object with the help of JVM
			
			throw new ArithmeticException("R is divided by zero");
			
		}catch(Exception e) {
			System.out.println("Inside catch block");
			System.out.println(e);
		}
	}
}

/*
 * From the above program it is clear that try block implicitly creating the exception object with the help of JVM and throwing the execption object to the nearest catch block.
 */