package com.nov18.task;

import java.util.Scanner;

public class ClassNotFoundExpDemo {
	
	public ClassNotFoundExpDemo(String str) {
	
		try {
			Class<?> c = Class.forName(str);
			System.out.println(c+" found: "+str);
		}
		catch(ClassNotFoundException e) {
			System.err.println("Class "+str+" not found.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the class name to load: ");
		String s = sc.nextLine();
		
		new ClassNotFoundExpDemo(s);
		sc.close();
	}
}
