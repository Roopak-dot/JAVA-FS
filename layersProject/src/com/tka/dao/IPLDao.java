package com.tka.dao;

import java.util.LinkedList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	public List<Player> getMITeam() {

		System.out.println("In IPLDao.getMITeam");

		List<Player> mi2025 = new LinkedList<>();
		mi2025.add(new Player(45, "Rohit Sharma", 6000, 15, "MI"));
		mi2025.add(new Player(33, "Hardik Pandya", 2000, 50, "MI"));
		mi2025.add(new Player(99, "Suryakumar Yadav", 3000, 5, "MI"));
		mi2025.add(new Player(93, "Ishan Kishan", 2500, 2, "MI"));
		mi2025.add(new Player(27, "Jasprit Bumrah", 100, 150, "MI"));
		mi2025.add(new Player(12, "Kieron Pollard", 3200, 60, "MI"));
		mi2025.add(new Player(22, "Trent Boult", 50, 70, "MI"));
		mi2025.add(new Player(21, "Rahul Chahar", 100, 40, "MI"));
		mi2025.add(new Player(17, "Aditya Tare", 800, 0, "MI"));
		mi2025.add(new Player(50, "Krunal Pandya", 1200, 35, "MI"));
		mi2025.add(new Player(91, "Marco Jansen", 60, 25, "MI"));
		
		return mi2025;
	}
	
	public List<Player> getGTTeam() {

		System.out.println("In IPLDao.getGTTeam");

		List<Player> gt2025 = new LinkedList<>();
		gt2025.add(new Player(7, "Shubman Gill", 2800, 0, "GT"));
		gt2025.add(new Player(33, "Hardik Pandya", 2000, 50, "GT"));
		gt2025.add(new Player(99, "Rashid Khan", 1000, 100, "GT"));
		gt2025.add(new Player(77, "David Miller", 2400, 10, "GT"));
		gt2025.add(new Player(18, "Rahul Tewatia", 900, 20, "GT"));
		gt2025.add(new Player(23, "Wriddhiman Saha", 1500, 0, "GT"));
		gt2025.add(new Player(55, "Mohammed Shami", 200, 120, "GT"));
		gt2025.add(new Player(12, "Lockie Ferguson", 100, 80, "GT"));
		gt2025.add(new Player(36, "Sai Sudharsan", 600, 0, "GT"));
		gt2025.add(new Player(88, "Alzarri Joseph", 50, 40, "GT"));
		gt2025.add(new Player(19, "Abhinav Manohar", 300, 0, "GT"));

		return gt2025;
	}

	public List<Player> getRCBTeam() {

		System.out.println("In IPLDao.getRCBTeam");

		List<Player> rcb2025 = new LinkedList<>();
		rcb2025.add(new Player(18, "Virat Kohli", 6700, 4, "RCB"));
		rcb2025.add(new Player(17, "AB de Villiers", 5000, 5, "RCB"));
		rcb2025.add(new Player(33, "Glenn Maxwell", 2500, 30, "RCB"));
		rcb2025.add(new Player(8, "Faf du Plessis", 3000, 2, "RCB"));
		rcb2025.add(new Player(96, "Dinesh Karthik", 4000, 0, "RCB"));
		rcb2025.add(new Player(23, "Harshal Patel", 200, 80, "RCB"));
		rcb2025.add(new Player(13, "Yuzvendra Chahal", 100, 120, "RCB"));
		rcb2025.add(new Player(27, "Mohammed Siraj", 50, 70, "RCB"));
		rcb2025.add(new Player(7, "Washington Sundar", 600, 25, "RCB"));
		rcb2025.add(new Player(45, "Devdutt Padikkal", 1100, 0, "RCB"));
		rcb2025.add(new Player(24, "Navdeep Saini", 80, 40, "RCB"));

		return rcb2025;
	}

	public List<Player> getPBSKTeam() {

		System.out.println("In IPLDao.getPBSKTeam");

		List<Player> pbsk2025 = new LinkedList<>();
		pbsk2025.add(new Player(97, "Shikhar Dhawan", 6500, 5, "PBSK"));
		pbsk2025.add(new Player(17, "Mayank Agarwal", 2200, 0, "PBSK"));
		pbsk2025.add(new Player(25, "Liam Livingstone", 800, 20, "PBSK"));
		pbsk2025.add(new Player(10, "Jonny Bairstow", 1500, 2, "PBSK"));
		pbsk2025.add(new Player(29, "Arshdeep Singh", 100, 60, "PBSK"));
		pbsk2025.add(new Player(6, "Kagiso Rabada", 250, 100, "PBSK"));
		pbsk2025.add(new Player(54, "Rahul Chahar", 200, 40, "PBSK"));
		pbsk2025.add(new Player(21, "Shahrukh Khan", 500, 0, "PBSK"));
		pbsk2025.add(new Player(44, "Harpreet Brar", 150, 10, "PBSK"));
		pbsk2025.add(new Player(90, "Bhanuka Rajapaksa", 400, 0, "PBSK"));
		pbsk2025.add(new Player(11, "Rishi Dhawan", 350, 25, "PBSK"));

		return pbsk2025;
	}

}
