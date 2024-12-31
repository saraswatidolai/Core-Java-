package com.r.oop;

public class Demo {
	static int x = 10;
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		++d1.x;
		--d2.x;
		
		System.out.println(d1.x);
		System.out.println(d2.x);
	}
}
