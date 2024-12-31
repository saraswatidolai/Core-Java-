package com.nov18.task;

public class ClassCastExceptionDemo {
	
	public static void handleClassCastException() {
		
		Object[] obj = {"Hello", true, "Java"};
		try {
			for(Object ob: obj) {
				String str = (String)ob;
				System.out.println("Casting successful: "+str);
			}
		}
		catch(ClassCastException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ClassCastExceptionDemo.handleClassCastException();
	}
}
