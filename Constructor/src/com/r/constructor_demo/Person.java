package com.r.constructor_demo;

public class Person {
	private int personId;
	private String personName;

	public Person() // No Argument Constructor
	{
		this.personId = 111;
		this.personName = "Scott";
	}

	@Override
	public String toString() 
	{
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

}
