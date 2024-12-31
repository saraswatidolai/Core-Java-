package com.number.type;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 145, sum=0, fact=1;
		int temp = num;
		while(num!=0) {  //145
			int r = num%10;  //5
			for(int i=1; i<=r; i++) {
				fact*=i;
			}
			sum +=fact;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a Strong number");
		}
	}
}
