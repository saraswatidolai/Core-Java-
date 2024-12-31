package com.r.myexception;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException{
	
	public GreaterMarksException() {

	}
	public GreaterMarksException(String errorMessage) {
		super(errorMessage);
	}
}

public class CustomUnchecked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(sc){
			System.out.print("Enter your mark: ");
			int mark = sc.nextInt();
			
			if(mark>100) {
				throw new GreaterMarksException("Invalid mark");
			}
			else {
				System.out.println("Your Mark is: "+mark);
			}
		}
		catch(GreaterMarksException e) {
			System.out.println(e);
		}

	}

}
