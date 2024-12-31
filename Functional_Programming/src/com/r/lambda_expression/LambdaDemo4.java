package com.r.lambda_expression;

interface Length{
	int getStringLength(String str);
}

//class Length1 implements Length{
//
//	@Override
//	public int getStringLength(String str) {
//		
//		return str.length();
//	}
//	
//}
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		Length l = str-> str.length();
		System.out.println("Length is :"+l.getStringLength("India"));
	}

}