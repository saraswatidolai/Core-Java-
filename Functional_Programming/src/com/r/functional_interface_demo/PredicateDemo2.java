package com.r.functional_interface_demo;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		//verify my name starts with 'A' or not?
		Predicate<String> p2 = name->name.startsWith("A");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println(name+" starts with character A :"+p2.test(name));
		sc.close();
	}
}
