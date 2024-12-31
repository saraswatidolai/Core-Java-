package com.r.basic;

public class TestError {
	public static void main(String[] args) {
		try {
			throw new OutOfMemoryError();
			
		}catch (Error e) {
			System.err.println("Some user message");
		}
		System.out.println("Completed!!");
	}
}
