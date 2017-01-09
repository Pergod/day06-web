package com.itcast.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("URI="+req.getRequestURI());
		System.out.println("URL="+req.getRequestURL());
		
		System.out.println(req.getQueryString());
		System.out.println(req.getRemoteAddr());
//		System.out.println(req.getRemoteHost());
		//获取客户机的端口
//		System.out.println(req.getRemotePort());
	}
}
