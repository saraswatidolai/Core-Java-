package com.r.lambda_expression;

import java.util.Scanner;

interface Calculator{
	double getSquareAndCube(int num);
}
public class LambdaDemo5 {

	public static void main(String[] args) {
	
		Calculator calc = num ->
		{
			if(num<=0) {
				return -1;
			}
			else if(num%2==0){
				return (num*num);
			}
			else {
				return (num*num*num);
			}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = sc.nextInt();
		sc.close();
		System.out.println(calc.getSquareAndCube(no));		
	}
}
