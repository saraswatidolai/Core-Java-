//WAP to show that java.lang.Exception is the super class for all the exceptions (Checked + Unchecked)

package com.r.basic;

import java.io.IOException;

public class ExceptionSuper {
	public static void main(String[] args) {
		Exception e = new IOException("Input/Output Exception");
		System.out.println(e);
		
		Exception e1 = new ArithmeticException("Divide by zero problem");
		System.out.println(e1);
	}
}

/*
 
 output:
 
 java.io.IOException: Input/Output Exception
 java.lang.ArithmeticException: Divide by zero problem
 
 Fully Qualified Name : errorMesage
 Package Name + Class Name : errorMessage
*/