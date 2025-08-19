package com.tka.controller;

import java.util.ArrayList;
import java.util.List;
import com.tka.entity.Player;

import com.tka.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		System.out.println("In IPLController.main()");
		
		IPLService service = new IPLService();
		
		List<Player> mi2025 =  service.getMITeam();
		List<Player> gt2025 =  service.getGTTeam();
		List<Player> rcb2025 =  service.getRCBTeam();
		List<Player> pbsk2025 =  service.getPBSKTeam();
		
		System.out.println("Team MI players list");
		for(Player p : mi2025) {
			System.out.println("Jersey No : " +p.getJn()+ " Name : " + p.getName() + " Runs : " +p.getRuns()+ " Wickets : " +p.getWickets()+ " Team :" +p.getTeam());
		}
		
		System.out.println("Team GT players list");
		for(Player p : gt2025) {
			System.out.println("Jersey No : " +p.getJn()+ " Name : " + p.getName() + " Runs : " +p.getRuns()+ " Wickets : " +p.getWickets()+ " Team :" +p.getTeam());
		}
		
		System.out.println("Team RCB players list");
		for(Player p : rcb2025) {
			System.out.println("Jersey No : " +p.getJn()+ " Name : " + p.getName() + " Runs : " +p.getRuns()+ " Wickets : " +p.getWickets()+ " Team :" +p.getTeam());
		}
		
		//Enhanched for loop
		System.out.println("Team PBSK players list");
		for(Player p : pbsk2025) {
			System.out.println("Jersey No : " +p.getJn()+ " Name : " + p.getName() + " Runs : " +p.getRuns()+ " Wickets : " +p.getWickets()+ " Team :" +p.getTeam());
		}

		//Normal for loop
		for(int i = 0; i<rcb2025.size(); i++) {
			System.out.println(rcb2025.get(i).getName());
		}
		
		//forEach method
		rcb2025.forEach(p -> System.out.println(p.getName()+ "--->" +p.getRuns()));
		
		//Adding Batters in a new list
		List<Player> rcbBatters = new ArrayList<>();
		rcb2025.forEach(p -> {if (p.getRuns() > 2000) {rcbBatters.add(p);}});				;
		//System.out.println(rcbBatters);
		
		System.out.println("\nAll players in RCB using method reference : ");
		rcb2025.forEach(System.out :: println);
	}

}
