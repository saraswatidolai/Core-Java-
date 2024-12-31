package com.r.try_with_resource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResource1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc){
			System.out.print("Enter your Rollno: ");
			int rollno = sc.nextInt();
			System.out.println("Your RollNo: "+rollno);
		}
		catch(InputMismatchException e) {
			System.err.println("please provide numeric value");
		}
		System.out.println("Execution completed");
	}
}
