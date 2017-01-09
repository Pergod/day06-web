package com.itcast.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		test1(req, resp);
		
		/*
		 * 此种跳转会导致异常
		 */
		PrintWriter writer=resp.getWriter();
		writer.write("hello");
		//关闭
		writer.close();
		/*
		 * 1.writer关闭之后再跳转会导致异常
		 * 2.同时不能跳转两次或多次，在每次跳转之后，最好加上return,避免后续的执行
		 */
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void test1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("data", "value");
		req.getRequestDispatcher("/day06/msg.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
