package com.itcast.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * ∑¿µ¡¡¥
 */
public class RequestDemo5 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String refer=req.getHeader("refer");
		if (refer==null||!refer.startsWith("http://localhost:8080/day06")) {
			resp.sendRedirect("/day06/index.jsp");
			return;
		}
	}
}
