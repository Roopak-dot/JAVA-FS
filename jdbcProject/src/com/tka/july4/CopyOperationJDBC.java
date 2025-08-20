package com.tka.july4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CopyOperationJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1255db";
		String uname = "root";
		String password = "MySql@Root";
		
		String copyquery = "INSERT INTO playerbackup SELECT * FROM player";

		try {
			// Step 1: Load the driver class
			Class.forName(path);
			System.out.println("Driver class loaded successfully");

			// Step 2: Create a connection
			conn = DriverManager.getConnection(url, uname, password);
			System.out.println("Connection established successfully");

			// Step 3: Create a PreparedStatement
			pstmt = conn.prepareStatement(copyquery);
			System.out.println("PreparedStatement created successfully");

			//Step 4: Execute the insert operation
			int rowsAffected = pstmt.executeUpdate();
			
			if(rowsAffected>0) {
				System.out.println("Copy operation successful. Rows affected " +rowsAffected);
			} else {
				System.out.println("Copy operation failed.");
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			System.out.println("Copy operation failed.");
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
