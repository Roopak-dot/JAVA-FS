package com.tka.controller;

public class Player {
	
	private int jn;
	private String pname;
	private int runs;
	private int wickets;
	
	public Player() {}
	
	public Player(int j, String n, int r, int w) {
		
		jn = j;
		pname = n;
		runs = r;
		wickets = w;
	}
	
	public void display() {
		
		System.out.println("Jeresy no : " +jn);
		System.out.println("Player name : " +pname);
		System.out.println("Runs : " +runs);
		System.out.println("Wickets : " +wickets);
		
	}
}
