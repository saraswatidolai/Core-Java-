package com.nov15.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enetr the first integer(a): ");
			int a = sc.nextInt();
			System.out.print("Enetr the second integer(b): ");
			int b = sc.nextInt();
			System.out.println("You entered a = "+a+" and b = "+b);
		}
		catch(InputMismatchException e) {
			System.out.println("An InputMismatchException occured.");
			System.out.println("Message: "+e.getMessage());
			System.out.println("String Representation: "+e.toString());
			System.out.println("Stack trace:");
			e.printStackTrace();
		}
		sc.close();
	}
}
