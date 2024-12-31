package com.number.type;

public class CountOfNumber {

	public static void main(String[] args) {
		int num = 23456, cout=0;
		int n =num;
		while(num!=0) {
			num/=10;
			cout++;
		}
		System.out.println("Count of "+n+" is :"+cout);
	}
}
