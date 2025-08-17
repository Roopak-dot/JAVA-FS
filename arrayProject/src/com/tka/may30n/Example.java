package com.tka.may30n;

public class Example {

	public static void main(String[] args) {

		// Team MI
		Player[] MI = new Player[11];
		MI[0] = new Player(45, "Rohit Sharma", 6000, 15, "MI");
		MI[1] = new Player(33, "Hardik Pandya", 2000, 50, "MI");
		MI[2] = new Player(99, "Suryakumar Yadav", 3000, 5, "MI");
		MI[3] = new Player(93, "Ishan Kishan", 2500, 2, "MI");
		MI[4] = new Player(27, "Jasprit Bumrah", 100, 150, "MI");
		MI[5] = new Player(12, "Kieron Pollard", 3200, 60, "MI");
		MI[6] = new Player(22, "Trent Boult", 50, 70, "MI");
		MI[7] = new Player(21, "Rahul Chahar", 100, 40, "MI");
		MI[8] = new Player(17, "Aditya Tare", 800, 0, "MI");
		MI[9] = new Player(50, "Krunal Pandya", 1200, 35, "MI");
		MI[10] = new Player(91, "Marco Jansen", 60, 25, "MI");

		// Team GT
		Player[] GT = new Player[11];
		GT[0] = new Player(7, "Shubman Gill", 2800, 0, "GT");
		GT[1] = new Player(33, "Hardik Pandya", 2000, 50, "GT");
		GT[2] = new Player(99, "Rashid Khan", 1000, 100, "GT");
		GT[3] = new Player(77, "David Miller", 2400, 10, "GT");
		GT[4] = new Player(18, "Rahul Tewatia", 900, 20, "GT");
		GT[5] = new Player(23, "Wriddhiman Saha", 1500, 0, "GT");
		GT[6] = new Player(55, "Mohammed Shami", 200, 120, "GT");
		GT[7] = new Player(12, "Lockie Ferguson", 100, 80, "GT");
		GT[8] = new Player(36, "Sai Sudharsan", 600, 0, "GT");
		GT[9] = new Player(88, "Alzarri Joseph", 50, 40, "GT");
		GT[10] = new Player(19, "Abhinav Manohar", 300, 0, "GT");

		// Team PBSK
		Player[] PBSK = new Player[11];
		PBSK[0] = new Player(97, "Shikhar Dhawan", 6500, 5, "PBSK");
		PBSK[1] = new Player(17, "Mayank Agarwal", 2200, 0, "PBSK");
		PBSK[2] = new Player(25, "Liam Livingstone", 800, 20, "PBSK");
		PBSK[3] = new Player(10, "Jonny Bairstow", 1500, 2, "PBSK");
		PBSK[4] = new Player(29, "Arshdeep Singh", 100, 60, "PBSK");
		PBSK[5] = new Player(6, "Kagiso Rabada", 250, 100, "PBSK");
		PBSK[6] = new Player(54, "Rahul Chahar", 200, 40, "PBSK");
		PBSK[7] = new Player(21, "Shahrukh Khan", 500, 0, "PBSK");
		PBSK[8] = new Player(44, "Harpreet Brar", 150, 10, "PBSK");
		PBSK[9] = new Player(90, "Bhanuka Rajapaksa", 400, 0, "PBSK");
		PBSK[10] = new Player(11, "Rishi Dhawan", 350, 25, "PBSK");

		// Team RCB
		Player[] RCB = new Player[11];
		RCB[0] = new Player(18, "Virat Kohli", 6700, 4, "RCB");
		RCB[1] = new Player(17, "AB de Villiers", 5000, 5, "RCB");
		RCB[2] = new Player(33, "Glenn Maxwell", 2500, 30, "RCB");
		RCB[3] = new Player(8, "Faf du Plessis", 3000, 2, "RCB");
		RCB[4] = new Player(96, "Dinesh Karthik", 4000, 0, "RCB");
		RCB[5] = new Player(23, "Harshal Patel", 200, 80, "RCB");
		RCB[6] = new Player(13, "Yuzvendra Chahal", 100, 120, "RCB");
		RCB[7] = new Player(27, "Mohammed Siraj", 50, 70, "RCB");
		RCB[8] = new Player(7, "Washington Sundar", 600, 25, "RCB");
		RCB[9] = new Player(45, "Devdutt Padikkal", 1100, 0, "RCB");
		RCB[10] = new Player(24, "Navdeep Saini", 80, 40, "RCB");

		Example.displayTeam(RCB);
		Example.searchPlayer(MI, "Rohit Sharma");
		Example.topScorer(PBSK);
		Example.topWicketTaker(GT);
		Example.countPlayersStartingWithK(MI);
		Example.countPlayersEndingWithL(RCB);
	}

	// Method to display players of a team
	static void displayTeam(Player[] team) {
		for (Player p : team) {
			System.out.println("Jersey: " + p.getJn() + ", Name: " + p.getName() + ", Runs: " + p.getRuns()
					+ ", Wickets: " + p.getWickets() + ", Team: " + p.getTeam());
		}
	}

	// Search player by name
	static void searchPlayer(Player[] team, String name) {
		boolean found = false;
		for (Player p : team) {
			if (p.getName().equalsIgnoreCase(name)) {
				System.out.println(
						"Found Player → " + p.getName() + " | Runs: " + p.getRuns() + " | Wickets: " + p.getWickets());
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("Player not found in this team.");
	}

	// Find top scorer
	static void topScorer(Player[] team) {
		Player top = team[0];
		for (Player p : team) {
			if (p.getRuns() > top.getRuns()) {
				top = p;
			}
		}
		System.out.println("🏏 Top Scorer: " + top.getName() + " with " + top.getRuns() + " runs.");
	}

	// Find top wicket taker
	static void topWicketTaker(Player[] team) {
		Player top = team[0];
		for (Player p : team) {
			if (p.getWickets() > top.getWickets()) {
				top = p;
			}
		}
		System.out.println("🎯 Top Wicket Taker: " + top.getName() + " with " + top.getWickets() + " wickets.");
	}
	
	static void countPlayersStartingWithK(Player[] team) {
	    int count = 0;
	    for (Player p : team) {
	        if (p.getName().startsWith("K")) {
	            count++;
	        }
	    }
	    System.out.println("🔎 Players with names starting with 'K': " + count);
	}
	
	// Count how many players' names end with 'l'
	static void countPlayersEndingWithL(Player[] team) {
	    int count = 0;
	    for (Player p : team) {
	        if (p.getName().toLowerCase().endsWith("l")) { // case insensitive
	            count++;
	        }
	    }
	    System.out.println("🔎 Players with names ending with 'l': " + count);
	}
	//

}