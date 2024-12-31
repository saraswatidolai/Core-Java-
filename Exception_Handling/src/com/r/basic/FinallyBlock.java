package com.r.basic;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		try {
			System.out.println(10/0);
		}
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Main method ended");
	}
}

/*
 In the above program finally block will be executed, even we have an exception in the try block but here only the resources will be handled but not the exception.
 */