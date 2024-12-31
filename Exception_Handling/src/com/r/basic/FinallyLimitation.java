package com.r.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation {
	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Enter your age: ");
			int age = sc.nextInt();
			System.out.println("Your age is: "+age);
		}
		catch(InputMismatchException e) {
			System.err.println("Please provide numeric value only");
		}
		finally {
			System.out.println("Inside finally block");
			sc.close();
		}
	}
}
