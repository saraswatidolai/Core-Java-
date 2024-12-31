package com.r.lambda_expression;

@FunctionalInterface
interface Printable{
	void print();
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		Printable p = ()->System.out.println("Printing");
		p.print();
	}
}
