package com.r.try_with_resource;


public class Main {
	public static void main(String[] args) {
		var dr = new DatabaseResource();
		var fr = new FileResource();
		
		try(dr;fr){
			System.out.println(10/0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
