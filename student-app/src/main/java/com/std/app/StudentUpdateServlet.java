package com.std.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;

	public StudentUpdateServlet() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int stdId = Integer.parseInt(request.getParameter("stdid"));
		String fn = request.getParameter("firstnm");
		String ln = request.getParameter("lastnm");
		String email = request.getParameter("email");

		String query = "SELECT *FROM student";

		String res = null;

		try {
			Statement statement = con.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			boolean flag = false;

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				if (stdId == id)
					flag = true;
			}

			if (flag)
				res = updateStudent(stdId, fn, ln, email);
			else
				res = insertStudent(stdId, fn, ln, email);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		if (res.equals("success"))
			response.getWriter().println("Success");
		else
			response.getWriter().println("Error");
	}

	private String insertStudent(int stdId, String firstName, String lastName, String email) {
		String message = null;
		try {
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
			prepareStatement.setInt(1, stdId);
			prepareStatement.setString(2, firstName);
			prepareStatement.setString(3, lastName);
			prepareStatement.setString(4, email);

			int result = prepareStatement.executeUpdate();
			if (result > 0)
				message = "success";
			else
				message = "failure";
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return message;
	}

	private String updateStudent(int stdId, String firstName, String lastName, String email) {
		String message = null;

		try {
			PreparedStatement prepareStatement = con
					.prepareStatement("UPDATE student SET firstName=?, lastName=?, email=? WHERE stdId=?");
			prepareStatement.setString(1, firstName);
			prepareStatement.setString(2, lastName);
			prepareStatement.setString(3, email);
			prepareStatement.setInt(4, stdId);

			int result = prepareStatement.executeUpdate();
			if (result > 0)
				message = "success";
			else
				message = "failure";
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return message;
	}
}
