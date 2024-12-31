package com.r.oop;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee john = new Employee();
		john.setEmployeeData(111, "John", 95000);
		john.calculateEmployeeGrade();
		john.getEmployeeData();
	}
}
