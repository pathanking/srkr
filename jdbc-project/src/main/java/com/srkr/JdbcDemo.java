package com.srkr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/students", "root", "root");

		String query = "SELECT *FROM student";

		Statement statement = con.createStatement();

		ResultSet resultSet = statement.executeQuery(query);

		while (resultSet.next()) {
			int stdId = resultSet.getInt(1);
			String fname = resultSet.getString(2);
			String lname = resultSet.getString(3);
			String email = resultSet.getString(4);

			System.out.println(stdId + " " + fname + " " + lname + " " + email);
		}
	}
}
