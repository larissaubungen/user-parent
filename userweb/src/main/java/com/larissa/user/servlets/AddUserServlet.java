package com.larissa.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.larissa.user.dao.UserDAO;
import com.larissa.user.dao.UserDAOImpl;
import com.larissa.user.dto.User;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddUserServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
				
		UserDAO dao = new UserDAOImpl();
		dao.create(user);
		
		PrintWriter out = response.getWriter();
		out.print("User Created!");
	}

}
