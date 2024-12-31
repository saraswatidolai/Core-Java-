package com.r.vector;

import java.util.*;

public class VectorDemo2 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		int x[] = {22,20,10,40,15,58};
		
		//Adding array element to vector
		for(int i=0; i<x.length; i++) {
			v.add(x[i]);
		}
		Collections.sort(v);
		System.out.println("Maximum element is: "+Collections.max(v));
		System.out.println("Minimum element is: "+Collections.min(v));
		System.out.println("Vector Elements:");
		v.forEach(y->System.out.println(y));
		System.out.println("---------------------------------------");
		Collections.reverse(v);
		v.forEach(y->System.out.println(y));
	}	
}
	
	