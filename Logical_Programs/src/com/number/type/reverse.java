package com.number.type;

public class reverse {

	public static void main(String[] args) {
		int num = 123, r, rev=0;
		int temp = num;
		while(temp!=0) {
			r = temp%10;
			rev = rev*10+r;
			temp/=10;
		}
		System.out.println("Reverse of "+num+" is :"+rev);
	}
}
