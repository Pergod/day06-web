package com.itcast.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo4 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * 控制编码
		 */
		resp.setContentType("text/html;charset=UTF-8");
//		resp.setCharacterEncoding("UTF-8");
//		resp.setHeader("content-type", "text/html;charset=UTF-8");
		/*
		 * 注意缓存时间，是从1970年开始，所以需用以下写法
		 */
//		resp.setHeader("expires", System.currentTimeMillis()+"1000*3600");
		resp.setDateHeader("expires", System.currentTimeMillis()+1000*3600);
		resp.getWriter().write("三国演义");
	}
}
