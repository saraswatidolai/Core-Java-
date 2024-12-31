package com.r.basic;

public class PrintTrackTrace {
	public static void main(String[] args) {
		System.out.println("Mian method started");
		
		try {
			
			String x ="NIT";
			int y = Integer.parseInt(x);
			System.out.println(y);
		}catch(Exception e) {
			e.printStackTrace(); //For complete Exception details
			System.out.println("_____________________________________");
			System.out.println("-------------------------------------");
			System.err.println(e.getMessage());  //only for Exception message
			System.out.println("-------------------------------------");
			System.err.println(e.toString());
		}
		System.out.println("Main method ended");
	}
}
