package com.r.oop;

import java.util.Scanner;

public class Manager {
	int managerId;
	String managerName;
	
	public void setManagerData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr manager Id :");
		managerId = sc.nextInt();
		System.out.print("Enter manager Name :");
		String name = sc.nextLine(); 
		managerName = sc.nextLine(); 
		sc.close();
	}
	
	public void getManagerData() {
		System.out.println("Manager Id :"+managerId);
		System.out.println("Manager Name :"+managerName);
	}
}
