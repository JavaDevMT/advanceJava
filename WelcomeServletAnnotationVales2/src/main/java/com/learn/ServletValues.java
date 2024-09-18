package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servletValues")
public class ServletValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("this is init method");
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String var1 = request.getParameter("var1");
    String var2 = request.getParameter("var2");
    
		response.setContentType("text/html");
		
		
		PrintWriter writer = response.getWriter();
		writer.append("FirstName " +var1+ "<br>");
		
		writer.append("LastName " +var2+ "<br>");
		
		writer.close();
		
	}
	@Override
	public void destroy() 
	{
		
			System.out.println("i am ending");
		}
	
	}


