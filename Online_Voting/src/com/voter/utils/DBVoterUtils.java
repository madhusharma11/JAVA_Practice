package com.voter.utils;

import java.sql.*;


public class DBVoterUtils {
	private static Connection connection;
	private static final String DB_URL;
	private static final String USER_NAME;
	private static final String PASSWORD;
	static {
		DB_URL = "jdbc:mysql://localhost:3306/iacsd_mar24";
		USER_NAME = "root";
		PASSWORD = "iacsd";
	}
	
	public static Connection openConnection() throws Exception
	{
		return connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
	}

	
	
	
	
	
	
	
	
	public static void closeConnection() throws SQLException{
		if(connection != null)
			connection.close();
		System.out.println("db cn closed !");
	}

	

}
