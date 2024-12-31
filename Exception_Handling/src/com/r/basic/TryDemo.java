package com.r.basic;

import java.util.Scanner;

public class TryDemo {
	public static void main(String[] args) {
		System.out.println("Main method started!!!");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value of x: ");
			int x = sc.nextInt();
			
			System.out.println("Enter the value of y: ");
			int y = sc.nextInt();
			
			int result = x/y;
			System.out.println("Result is: "+result);
			
			System.out.println("End of try block");
			sc.close();
			
		}catch(Exception e) {
			System.out.println("inside catch block");
			System.out.println(e);
		}
		System.out.println("Main method ended!!!");
	}
}

/*
In the above program if we put the value of y as 0 but still program will be executed normally because we have used try-catch so it is a 
normal termination even we have an exception in the program.
 */