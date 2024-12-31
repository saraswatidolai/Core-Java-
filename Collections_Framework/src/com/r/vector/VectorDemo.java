package com.r.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<String> listOfCapacity = new Vector<String>();
		listOfCapacity.add("Hyderabad");
		listOfCapacity.add("Pune");
		listOfCapacity.add("Indore");
		listOfCapacity.add("Bhubneswar");
		listOfCapacity.add("Kolkata");
		
		Collections.sort(listOfCapacity);
		System.out.println(listOfCapacity);
		
		listOfCapacity.remove("Kolkata");   //removing based on the Object	
		System.out.println(listOfCapacity);
		
		listOfCapacity.remove(3);			//removing based on the index
		System.out.println(listOfCapacity);   
		
	}
}
