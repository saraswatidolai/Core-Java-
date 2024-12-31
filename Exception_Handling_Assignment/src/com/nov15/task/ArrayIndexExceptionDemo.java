package com.nov15.task;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			a[0]=1;
			a[1]=2;
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException occurred");
			System.out.println("Message: "+e.getMessage());
			System.out.println("String representation: "+e.toString());
			System.out.println("Stack trace:");
			e.printStackTrace();
		}
	}
}
