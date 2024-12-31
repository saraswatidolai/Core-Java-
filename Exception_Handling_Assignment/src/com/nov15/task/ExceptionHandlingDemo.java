package com.nov15.task;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void handleExceptions(String str) {
		try {
						
			int number = Integer.parseInt(str);
			
			System.out.println("Length of the input string: "+str.length());
			
			System.out.println("Converted number: "+number);
		}
		catch(NullPointerException e) {
			System.err.println("NullPointerException: Attempted to operate on a null object.");
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.err.println("NumberFormatException: Invalid input, not a number.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to convert to an integer: ");
		String str = sc.nextLine();
		
		ExceptionHandlingDemo.handleExceptions(str);
		sc.close();
	}
}
