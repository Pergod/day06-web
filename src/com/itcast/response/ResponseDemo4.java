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
		 * ���Ʊ���
		 */
		resp.setContentType("text/html;charset=UTF-8");
//		resp.setCharacterEncoding("UTF-8");
//		resp.setHeader("content-type", "text/html;charset=UTF-8");
		/*
		 * ע�⻺��ʱ�䣬�Ǵ�1970�꿪ʼ��������������д��
		 */
//		resp.setHeader("expires", System.currentTimeMillis()+"1000*3600");
		resp.setDateHeader("expires", System.currentTimeMillis()+1000*3600);
		resp.getWriter().write("��������");
	}
}
