package com.number.type;

public class SumOfNumber {

	public static void main(String[] args) {
		int num = 324;
		int r, sum = 0;
		while(num!=0) {
			r = num%10;    //r = 4,2,3
			sum += r;      //sum = 0+4=4+2=6+3=9
			num /= 10;     // num = 32, 3, 0
		}
		System.out.println(sum);
	}
}
