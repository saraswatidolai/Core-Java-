package com.number.type;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121, r, rev=0;
		int temp = num;
		while(temp!=0) {
			r = temp%10;
			rev = rev*10+r;
			temp/=10;
		}
		if(num==rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
}
