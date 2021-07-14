package com.larissa.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.larissa.user.dao.UserDAOImpl;
import com.larissa.user.dto.User;

/**
 * Servlet implementation class DisplayUserServlert
 */
public class DisplayUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		UserDAOImpl dao = new UserDAOImpl();
		User user = dao.findUser(id);
		
		PrintWriter writer = response.getWriter();
		writer.println("User Details");
		//writer.println("User ID " + id);
		writer.println("User ID: " + user.getId());
		writer.println("User Name: " + user.getName());
		writer.println("User Email: " + user.getEmail());
	}

}
