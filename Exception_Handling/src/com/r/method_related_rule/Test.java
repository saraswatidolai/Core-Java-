package com.r.method_related_rule;

/*
  If the try block does not throw any checked exception then in the corresponding catch block we can't handle checked exception.
  It will generate compilation error i.e "exception never thrown from the corresponding try statement"
 */
public class Test {
	public static void main(String[] args) {
		try {
			throw new InterruptedException(); // if try block does not throw exception then error in the catch  
		}
		catch(InterruptedException e) {  //error if try block not throw exception(invalid)
			e.printStackTrace();  
		}
	}
}
