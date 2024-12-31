package com.r.method_related_rule;

/*
  If the try block does not throw any exception then in the corresponding catch block 
  we can write Exception OR Throwable because both are the super classes for all types of Exception 
  whether it is checked or unchecked.
 */

public class CatchingWithSuperClass {

	public static void main(String[] args) {
		try {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
