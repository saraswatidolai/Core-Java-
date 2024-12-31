package com.r.oop;

public class Student {
	String studentName;
	int studentRollNumber;
	double studentHeight;
	
	public void talk() {
		System.out.println("My name is :"+studentName);
		System.out.println("My rollNumber is :"+studentRollNumber);
		System.out.println("My Height is :"+studentHeight);
	}
	
	public void writeExam() {
		System.out.println("Every saturday "+studentName+" is writing the Exam paper");
	}
}
