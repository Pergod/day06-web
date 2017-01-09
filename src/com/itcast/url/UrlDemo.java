package com.itcast.url;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlDemo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1.服务器
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		//2.浏览器
		resp.sendRedirect("/day06/index.jsp");
		
		//3.服务器
		this.getServletContext().getRealPath("/index.jsp");
		
		//4.服务器
		this.getServletContext().getResourceAsStream("/index.jsp");
		
		/*
		 * 5.浏览器
		 * <a href="/day06/index.jsp">链接</a>
		 * 
		 * 6.浏览器
		 * <form action="/day06/index.jsp"></form>
		 * 
		 * 
		 */
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
