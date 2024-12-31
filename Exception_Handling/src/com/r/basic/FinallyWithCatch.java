package com.r.basic;

public class FinallyWithCatch {

	public static void main(String[] args) {
		try {
			int x[]=new int [-2];
			x[0]=10;
			x[1]=20;
			System.out.println(x[0] +":"+ x[1]);
		}
		catch(NegativeArraySizeException e) {
			System.err.println("Array size is in negative value...");
		}
		finally {
			System.out.println("Resources will be handled here!!!");
		}

		System.out.println("Main method ended!!!");
	}

}
