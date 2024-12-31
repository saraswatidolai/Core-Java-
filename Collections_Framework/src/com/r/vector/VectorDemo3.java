package com.r.vector;

import java.util.Vector;

record Employee(Integer eId, String employeeName, Double employeesal) {

}
public class VectorDemo3 {
	 public static void main(String[] args) {
		
		 Vector<Employee> listOfEmployee = new Vector<>();
		 listOfEmployee.add(new Employee(111, "Scott", 40000d));
		 listOfEmployee.add(new Employee(222, "Smith", 50000d));
		 listOfEmployee.add(new Employee(333, "Scott", 55000d));
		 listOfEmployee.add(new Employee(444, "Scott", 60000d));
		 
		 listOfEmployee.forEach(emp -> System.out.println(emp));		 
	}
}
