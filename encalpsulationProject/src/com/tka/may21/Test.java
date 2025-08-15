package com.tka.may21;

public class Test {

	public static void main(String[] args) {

		// 2025

		// RCB -> 25
		// 10

		Player p1 = new Player(18, "Virat", 10000, 0, "RCB");
		Player p2 = new Player(23, "Rajat", 10000, 0, "RCB");

		System.out.println(p1);
		System.out.println(p2);

		// 15 auction
		Player p11 = new Player();
		p11.setJn(12);
		p11.setName("Salt");
		p11.setRuns(2500);
		p11.setWickets(0);
		p11.setTeam("RCB");
	}

}
