package com.itcast.response;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		test1(resp);
		test2(resp);
	}

	private void test2(HttpServletResponse resp) throws IOException {
		/*
		 * 1.����resp�Ժ������д������
		 */
		resp.setCharacterEncoding("UTF-8");
		/*
		 * 2.ָ��������Ժ�����������
		 */
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		
		//���������������
//		resp.setContentType("text/html;charset=UTF-8");
		String data="�й�";
		resp.getWriter().write(data);
	}

	private void test1(HttpServletResponse resp) throws IOException, UnsupportedEncodingException {
		String china="�й�";
//		resp.setHeader("content-charset", "gb2312");�޴���Ӧͷ
		
		/*
		 * �����������ʲô����
		 */
		resp.setHeader("Content-type", "text/html;charset=gb2312");
		
		/*
		 * ��Meta��ǩģ��http��Ӧ
		 */
//		resp.getOutputStream().write("<meta http-equiv='content-type' content='text/html;charset=gb2312'>".getBytes());
		/*
		 * �����Ժ���������
		 * 
		 */
		resp.getOutputStream().write(china.getBytes("UTF-8"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
