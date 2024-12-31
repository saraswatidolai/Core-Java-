package com.r.lambda_expression;

@FunctionalInterface
interface Calculate{
	void doSum(int x, int y);
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		Calculate calc = (c, d)->System.out.println(c+d);
		calc.doSum(12, 24);
	}
}
