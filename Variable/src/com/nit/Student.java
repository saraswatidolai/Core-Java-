package com.nit;

public class Student {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "NIT";
	static String courseName = "Java";
	
	public void setStudentData(int rollNumber, String studentName, String studentAddress) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName= " + studentName + ", studentAddress= "
				+ studentAddress + ", collegeName= "+ Student.collegeName +", courseName= "+ Student.courseName +"]";
	}
}
