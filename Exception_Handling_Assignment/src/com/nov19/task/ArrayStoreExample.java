package com.nov19.task;

public class ArrayStoreExample {

	public static void storeObjects() {
		Object strings[] =  new String[5];
		strings[0]= "Hello";
		strings[1]="World";
		strings[2]="Java";
				
	}
	public static void main(String[] args) {
		try {
			storeObjects();
			System.out.println("Object stored successfully");
		}
		catch(ArrayStoreException e) {
			System.err.println("Integer in a String array");
		}

	}
}
