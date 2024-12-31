package com.r.oop;

public class PlayerDemo {
	public static void main(String[] args) {
		Player rohit = new Player();
		rohit.setPlayerData(45, "Rohit Sharma");
		rohit.getPlayerData();
		
		System.out.println("-----------------------------");
		
		Player virat = new Player();
		virat.setPlayerData(18, "Virat kohli");
		virat.getPlayerData();
	}
}
