package com.r.vector;

import java.util.*;

public class VectorDemo1 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(100,10);
		
		System.out.println("Initial Capacity is: "+v.capacity());
		for(int i=0; i<100; i++) {
			v.add(i);
		}
		System.out.println("After adding 100 elements capacity is: "+v.capacity());
		v.add(101);
		System.out.println("After adding 101th elements capacity is: "+v.capacity());
		v.forEach(System.out::println);
		
	}
}
