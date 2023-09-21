package com.gqt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition extends HttpServlet {
	private HttpSession session;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String parameter1 = req.getParameter("num1");
		int num1 = Integer.parseInt(parameter1);
		String parameter2 = req.getParameter("num2");
		int num2 = Integer.parseInt(parameter2);
		int add = num1 + num2;
		
		//creating a new session
		session = req.getSession(true);
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("add", add);
		resp.sendRedirect("/TestServlet/Multiplication");
	}
}

