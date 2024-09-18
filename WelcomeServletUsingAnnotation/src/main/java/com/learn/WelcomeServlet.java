package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("this is init method");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Request is what is sent to us by user
		String var1 = request.getParameter("var1");
		
		response.setContentType("text/html");
		
		//Response is what we sent back to user
		PrintWriter writer = response.getWriter();
		writer.append("Welcome " +var1);
		writer.close();
		//response.getWriter().append("Welcome  " +var1).close();
	}
		
		@Override
		public void destroy() 
		{
			
				System.out.println("i am ending");
			}
		
		
}
