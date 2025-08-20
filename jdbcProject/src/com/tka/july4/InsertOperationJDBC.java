package com.tka.july4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.july3.Player;

public class InsertOperationJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1255db";
		String uname = "root";
		String password = "MySql@Root";
		//String insertquery = "INSERT INTO player VALUES(?,?,?,?,?)";
		String updatequery = "UPDATE player SET runs = ? where jn = ?";

		try {
			// Step 1: Load the driver class
			Class.forName(path);
			System.out.println("Driver class loaded successfully");

			// Step 2: Create a connection
			conn = DriverManager.getConnection(url, uname, password);
			System.out.println("Connection established successfully");

			// Step 3: Create a PreparedStatement
			pstmt = conn.prepareStatement(updatequery);
			System.out.println("PreparedStatement created successfully");

			// Step 4: Set parameters for PreparedStatement
			pstmt.setInt(1, 20000);
			pstmt.setInt(2, 10);
			/*
			 * pstmt.setString(2, "Sachin Tendulkar"); pstmt.setInt(3, 10000);
			 * pstmt.setInt(4, 200); pstmt.setString(5, "India");
			 */
			//Step 5: Execute the insert operation
			int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected>0) {
				System.out.println("Insert operation successful. Rows affected " +rowsAffected);
			} else {
				System.out.println("Insert operation failed.");
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			System.out.println("Insert operation failed.");
			e.printStackTrace();
		} finally {
			if (conn != null && pstmt != null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}

}