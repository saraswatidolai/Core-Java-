package com.nov18.task;

import java.util.Scanner;

public class DivisonExample {
	
	public static int performDivision(int dividend, int divisor) {
		return dividend/divisor;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend : ");
		int a = sc.nextInt();
		System.out.print("Enter divisor : ");
		int b = sc.nextInt();
		
		try {
			int result = DivisonExample.performDivision(a, b);
			System.out.println("Result of division: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught: Division by zero: dividend="+a+", divisor="+b);
		}
		sc.close();
	}
}
