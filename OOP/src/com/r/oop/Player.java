package com.r.oop;

public class Player {
	int playerId;
	String playerName;
	
	public void setPlayerData(int pid, String pname) {
		playerId = pid;
		playerName = pname;
	}
	
	public void getPlayerData() {
		System.out.println("Player Id is :"+playerId);
		System.out.println("Player Name is :"+playerName);
	}
}
