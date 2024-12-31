package com.number.type;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 7, sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum = sum +i;
			}
		}
		if(num==sum) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a Perfect number");
		}
	}

}
