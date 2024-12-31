package test;


import java.util.List;

import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Object> l1 = new Vector<Object>();
		l1.add(12);
		l1.add("NIT");
		l1.add(true);
		l1.add(50);
		l1.add(null);
		
		System.out.println("l1 elements: "+l1);
		
		List<Object> l2 = new Vector<Object>();
		l2.add(16);
		l2.add("NIT");
		l2.add(false);
		l2.add('A');
		
		System.out.println("l2 elements: "+l2);
		
		
		
		System.out.println("List interface method:");
	}	
}