package com.r.basic;

public class MultiCatch1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Main started...");
		
		try {
			String str =null;
			System.out.println(str.toUpperCase());
			
			String str1="null";
			int x = Integer.parseInt(str1);
			System.out.println(x);
		}
		catch(NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ended..");
	}
}
