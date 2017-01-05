package com.itcast.day06;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String china="中国";
//		resp.setHeader("content-charset", "gb2312");无此响应头
		
		/*
		 * 控制浏览器以什么码表打开
		 */
		resp.setHeader("Content-type", "text/html;charset=gb2312");
		
		/*
		 * 用Meta标签模拟http响应
		 */
//		resp.getOutputStream().write("<meta http-equiv='content-type' content='text/html;charset=gb2312'>".getBytes());
		resp.getOutputStream().write(china.getBytes("UTF-8"));
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
