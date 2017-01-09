package com.itcast.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo5 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * 实现重定向
		 */
//		resp.setStatus(302);
//		resp.setHeader("location", "/day06/index.jsp");
		
		resp.sendRedirect("/day06/index.jsp");
		/*
		 * 实现转发
		 */
//		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		/*
		 * 两个方法不能同时调用
		 */
//		resp.getOutputStream();
//		resp.getWriter();
	}
}
