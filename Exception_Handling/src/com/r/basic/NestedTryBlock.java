package com.r.basic;

public class NestedTryBlock {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try{ //outer try
			
			String x =null;
			System.out.println("It's length is: "+x.length());
			
			try{ //inner try
				String y = "NIT";
				int z = Integer.parseInt(y);
				System.err.println("z value is: "+z);
			}
			catch(NumberFormatException e) {
				System.err.println("Number is not a proper format");
			}
		}
		catch(NullPointerException e) {
			System.out.println("Null point problem");
		}

	}
}
