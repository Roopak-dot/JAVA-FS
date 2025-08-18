package com.tka.jun9;

class Player {
    
	private int jn;
	private String name;
    private int runs;
    private int wickets;
    private String team;
	
    public Player() {
		super();
	}

	public Player(int jn, String name, int runs, int wickets, String team) {
		super();
		this.jn = jn;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
	}

	public int getJn() {
		return jn;
	}

	public void setJn(int jn) {
		this.jn = jn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [jn=" + jn + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", team=" + team
				+ "]";
	}

    
    
}
