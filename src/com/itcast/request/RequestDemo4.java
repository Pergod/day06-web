package com.itcast.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo4 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String data="data";
		resp.getWriter().write(data);
		/*
		 * ����ĵ����ݽ��ᱻ���
		 * forwardʱ�����response������,������Ӧͷ�ֶ��򱣳���Ч
		 */
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
