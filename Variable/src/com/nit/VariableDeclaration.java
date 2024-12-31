package com.nit;

public class VariableDeclaration {
	public static void main(String[] args) {
		Student raj =  new Student();
		raj.setStudentData(111, "Raj", "Ameerpet");
		System.out.println(raj);
		
		Student priya = new Student();
		priya.setStudentData(222, "Piya", "S.R Nagar");
		System.out.println(priya);
	}
}
