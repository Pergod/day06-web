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
		 * 上面的的数据将会被清空
		 * forward时会清空response的数据,但是响应头字段则保持有效
		 */
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
