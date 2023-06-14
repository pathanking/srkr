package com.std.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentAddServlet")

public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int stdId = Integer.parseInt(request.getParameter("stdid"));
		String fn = request.getParameter("firstnm");
		String ln = request.getParameter("lastnm");
		String email = request.getParameter("email");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
			prepareStatement.setInt(1, stdId);
			prepareStatement.setString(2, fn);
			prepareStatement.setString(3, ln);
			prepareStatement.setString(4, email);

			int result = prepareStatement.executeUpdate();

			if (result > 0)
				response.getWriter().println(result + " student record inserted!!");
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}