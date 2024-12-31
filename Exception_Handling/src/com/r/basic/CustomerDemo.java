package com.r.basic;

import java.util.Scanner;

//he main purpose of Exception handling to provide user-friendly message to our end user as shown in the program.

public class CustomerDemo {
	public static void main(String[] args) {
		
		System.out.println("Hello client, Welcome to my application");
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value of x: ");
			int x = sc.nextInt();
			
			System.out.println("Enter the value of y: ");
			int y = sc.nextInt();
			
			int result = x/y;
			System.out.println("Result is: "+result);
			
		}catch(Exception e) {
			System.err.println("Don't put zero");
		}
		sc.close();
		System.out.println("Thank you! for visiting my application");
	}
}

/*
 Exception handling = No Abnormal Termination + User-friendly message on wrong input given by the client.
*/