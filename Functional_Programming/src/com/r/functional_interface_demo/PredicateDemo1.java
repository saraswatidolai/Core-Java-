package com.r.functional_interface_demo;

import java.util.function.*;
import java.util.Scanner;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		//verify whether a number is even or odd
		Predicate<Integer> p1 = num->num%2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to verify even/odd: ");
		int no = sc.nextInt();
		
		System.out.println("Is "+no+" is even number ? "+p1.test(no));
		sc.close();
	}

}

/*
interface Predicate<T>{
void test(int num);
} 
 
*/