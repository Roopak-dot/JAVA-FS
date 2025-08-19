package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {

	public List<Player> getRCBTeam() {

		System.out.println("In IPLService.getRCBTeam()");

		IPLDao dao = new IPLDao();
		List<Player> rcb2025 = dao.getRCBTeam();
		return rcb2025;
	}

	public List<Player> getPBSKTeam() {
		
		System.out.println("In IPLService.getPBSKTeam()");

		IPLDao dao = new IPLDao();
		List<Player> pbsk2025 = dao.getPBSKTeam();
		return pbsk2025;
	}

	public List<Player> getGTTeam() {
		
		System.out.println("In IPLService.getGTTeam()");

		IPLDao dao = new IPLDao();
		List<Player> gt2025 = dao.getGTTeam();
		return gt2025;
	}

	public List<Player> getMITeam() {
		
		System.out.println("In IPLService.getMITeam()");

		IPLDao dao = new IPLDao();
		List<Player> mi2025 = dao.getMITeam();
		return mi2025;
	}

}
