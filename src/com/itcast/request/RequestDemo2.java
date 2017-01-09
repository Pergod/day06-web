package com.itcast.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		System.out.println(req.getParameter("gender"));
		String[] hobbys=req.getParameterValues("hobby");
		if (hobbys!=null) {
			for (String hobby : hobbys) {
				System.out.println(hobby);
			}
		}
		System.out.println(req.getParameter("description"));
		System.out.println(req.getParameter("id"));
	}
}
