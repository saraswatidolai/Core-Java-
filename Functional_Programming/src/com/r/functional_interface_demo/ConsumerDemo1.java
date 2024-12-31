package com.r.functional_interface_demo;

import java.util.function.Consumer;

record Employee(Integer employeeId, String employeeName) {
	
}

public class ConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<Integer> c1 = num->System.out.println(num);
		c1.accept(12);
		
		Consumer<String> c2 = str->System.out.println(str);
		c2.accept("NIT");
		
		Consumer<Double> c3 = num->System.out.println(num);
		c3.accept(12.89);
		
		Consumer<Employee> c4 = emp->System.out.println(emp);
		c4.accept(new Employee(111, "Scott"));
		
		Consumer<String> c5 = str->System.out.println(str.toUpperCase());
		c5.accept("India");
	}
}


