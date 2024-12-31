package com.r.oop;

public class StudentDemo {
	public static void main(String[] args) {
		Student raj = new Student();
		raj.studentName="Raj";
		raj.studentRollNumber=111;
		raj.studentHeight=5.8;
		raj.talk();
		raj.writeExam();
		
		Student priya = new Student();
		priya.studentName = "Priya";
		priya.studentRollNumber = 222;
		priya.studentHeight = 5.6;
		priya.talk();
		priya.writeExam();
	}
}
