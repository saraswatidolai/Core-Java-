package com.r.basic;

public class MultiCatch {
	public static void main(String[] args) {
		
		System.out.println("Main started....");
		
		try {
			int c=10/2;
			System.out.println("c value is: "+c);
			
			int arr[]= {12,78,56};
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Array is out of limit");
		}
		catch(ArithmeticException e) {
			System.err.println("Divided by zero");
		}
		catch (Exception e) {
			System.err.println("General");
		}
		
		System.out.println("Main ended...");
	}
}
