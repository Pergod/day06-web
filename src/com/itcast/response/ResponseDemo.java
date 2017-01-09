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
		 * 1.设置resp以何种码表写出数据
		 */
		resp.setCharacterEncoding("UTF-8");
		/*
		 * 2.指定浏览器以何种码表打开数据
		 */
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		
		//等于以上两句代码
//		resp.setContentType("text/html;charset=UTF-8");
		String data="中国";
		resp.getWriter().write(data);
	}

	private void test1(HttpServletResponse resp) throws IOException, UnsupportedEncodingException {
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
		/*
		 * 控制以何种码表输出
		 * 
		 */
		resp.getOutputStream().write(china.getBytes("UTF-8"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
