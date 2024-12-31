package com.nov18.task;

import java.util.Scanner;

public class AreaCalculator {
	
	public static double calculateArea(double length, double width) {
		
		if(length<0 || width<0) {
			throw new IllegalArgumentException();
		}
		return length * width;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr length of rectangle: ");
		int l = sc.nextInt();
		System.out.print("Enetr width of rectangle: ");
		int w = sc.nextInt();
		
		try {
			double area = AreaCalculator.calculateArea(l, w);
			System.out.println("Area of rectangle with length "+l+" and width "+w+" is: "+area);
						
		}
		catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught: Dimension must be positive:");
			System.out.println("length="+l+", width="+w);
		}
		sc.close();
	}
}






//List<Integer> l1 = List.of(1,2,3,4);
//List<Integer> l2 = List.of(1,2,3,4);
//
//Integer integer = Stream.concat(l1.stream(), l2.stream()).reduce((x,y)->x+y).get();
//System.out.println(integer);