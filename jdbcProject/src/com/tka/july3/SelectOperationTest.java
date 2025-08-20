package com.tka.july3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectOperationTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1255db";
		String uname = "root";
		String password = "MySql@Root";
		String query1 = "Select * from player";
		
		List<Player> players = new ArrayList<>();
		
		try {
			//Step 1: Load the driver class
			Class.forName(path);
			System.out.println("Driver class loaded successfully");
			
			//Step 2: Create a connection
			conn = DriverManager.getConnection(url, uname, password);
			System.out.println("Connection established successfully");
			
			//Step 3: Create a statement
			st = conn.createStatement();
			System.out.println("Statement created successfully");
			
			//Step 4: Execute the query
			rs = st.executeQuery(query1);
			
			while(rs.next()) {
				int jn = rs.getInt(1);
				String name = rs.getString(2);
				int runs = rs.getInt(3);
				int wickets = rs.getInt(4);
				String tname = rs.getString(5);
				
				//Step 5: Process the result
				Player obj = new Player(jn, name, runs, wickets, tname);
				players.add(obj);
				
				//System.out.println("Jersey Number: " +jn+ " Name: " +name+ " Runs: " +runs+ " Wickets: " +wickets+ "Team: " +tname);
				
			}
			
			for(Player p : players) {
				System.out.println(p);
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			if(conn != null && st != null && rs != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}
