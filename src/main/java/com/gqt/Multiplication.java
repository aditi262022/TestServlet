package com.gqt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Multiplication extends HttpServlet {
	private HttpSession session;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		int num1 = (int)session.getAttribute("num1");
		int num2 = (int)session.getAttribute("num2");
		int add = (int)session.getAttribute("add");
		
		int mul = num1*num2;
		
		PrintWriter writer = response.getWriter();
		writer.println("The addition result is : "+add);
		writer.println("The multiplication result is : "+mul);
	}

}
