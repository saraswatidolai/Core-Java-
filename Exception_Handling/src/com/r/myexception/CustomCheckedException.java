package com.r.myexception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}

public class CustomCheckedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(sc){
			System.out.print("Enter your age: ");
			int age = sc.nextInt();
			
			if(age<18) {
				throw new InvalidAgeException("Age is invalid");
			}
			else {
				System.out.println("You can vote");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		
		System.out.println("Main method completed");
	}

}
