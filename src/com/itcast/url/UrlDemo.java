package com.itcast.url;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlDemo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1.������
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		//2.�����
		resp.sendRedirect("/day06/index.jsp");
		
		//3.������
		this.getServletContext().getRealPath("/index.jsp");
		
		//4.������
		this.getServletContext().getResourceAsStream("/index.jsp");
		
		/*
		 * 5.�����
		 * <a href="/day06/index.jsp">����</a>
		 * 
		 * 6.�����
		 * <form action="/day06/index.jsp"></form>
		 * 
		 * 
		 */
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
