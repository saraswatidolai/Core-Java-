package com.r.lambda_expression;

class Accept<T>{
	private T x;
	
	public Accept(T x) {
		super();
		this.x = x;
	}
	public T getX() {
		return x;
	}
}
public class TypeParameterDemo {

	public static void main(String[] args) {
		Accept<Integer> intType = new Accept<Integer>(12);
		System.out.println("integer type :"+intType.getX());
		
		Accept<String> strType = new Accept<String>("NIT");
		System.out.println("String type :"+strType.getX());
		
		Accept<Student> stdType = new Accept<Student>(new Student(111));
		System.out.println("Student type :"+stdType.getX());
	}
}
record Student(Integer studentId) {
	
}
