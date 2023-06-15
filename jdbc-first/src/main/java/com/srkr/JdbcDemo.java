package com.srkr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainees", "root", "root");

		String query = "SELECT *FROM trainee";

		try (Statement createStatement = con.createStatement()) {
			ResultSet resultSet = createStatement.executeQuery(query);

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String email = resultSet.getString(3);
				String course = resultSet.getString(4);
				String address = resultSet.getString(5);

				System.out.println(id + " " + name + " " + email + " " + course + " " + address);
			}
		}
		;

	}

}