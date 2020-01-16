package com.fasttrackit.DBHelper;

import java.sql.*;
import java.util.Properties;

public class DBHelper {

	public static Connection getConnection() {
		Properties conectionProperties = new Properties();
		conectionProperties.put("user", "root");
		conectionProperties.put("password", "andrei");

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		String connString = "jdbc:mysql://localhost:3306/finalproject";

		try {
			Connection con = DriverManager.getConnection(connString, conectionProperties);
			System.out.println("Conexiunea la baza de date a fost deschisa");
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
