package com.r.lambda_expression;

interface Vehicle{
	void run();
}
public class LambdaDemo2 { 

	public static void main(String[] args) {
		
		Vehicle car = ()->System.out.println("Car is Running");
		Vehicle bike = ()->System.out.println("Bike is Running");
		Vehicle bus = ()->System.out.println("Bus is Running");
		
		car.run(); bike.run(); bus.run();
	}

}
