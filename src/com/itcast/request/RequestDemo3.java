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
		 * ������ת�ᵼ���쳣
		 */
		PrintWriter writer=resp.getWriter();
		writer.write("hello");
		//�ر�
		writer.close();
		/*
		 * 1.writer�ر�֮������ת�ᵼ���쳣
		 * 2.ͬʱ������ת���λ��Σ���ÿ����ת֮����ü���return,���������ִ��
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
