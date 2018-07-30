package com.deloitte.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.Heartbeat;

/**
 * Servlet implementation class HitCounterServlet
 */
//@WebServlet("/count")
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<html>");
		out.println("<head>");
		out.println("<h3>");
		out.println("This is the first page");
		out.println("</h3>");
		out.println("</head>");
		out.println("<body>");
		out.println("You are user number # "+(++counter ));
		out.println("The IP address is "+request.getRemoteAddr());
		
		out.println(getServletConfig().getInitParameter("email"));
		
		out.println(getServletContext().getInitParameter("email"));
		
		Enumeration<String> headerNames = request.getHeaderNames();
		String headerName =  null;
		while(headerNames.hasMoreElements())
		{
			headerName = headerNames.nextElement();
			out.println(headerName+" : "+request.getHeader(headerName)+"<br>");
		}
		
	
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
