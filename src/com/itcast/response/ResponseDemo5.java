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
		 * ʵ���ض���
		 */
//		resp.setStatus(302);
//		resp.setHeader("location", "/day06/index.jsp");
		
		resp.sendRedirect("/day06/index.jsp");
		/*
		 * ʵ��ת��
		 */
//		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		/*
		 * ������������ͬʱ����
		 */
//		resp.getOutputStream();
//		resp.getWriter();
	}
}
