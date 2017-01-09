package com.itcast.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		refresh(resp);
//		refresh1(resp);
		refresh2(req, resp);
	}

	private void refresh2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * 实际开发中，应用此代码。
		 * 数据(Servlet产生)  --->  Jsp美化  --->跳转
		 */
		String msg="<meta http-equiv='refresh' content='3;url=/day06/index.jsp'>登录成功！页面自动跳转 ,如果页面没有跳转，点击这里 <a href ='/day06/index.jsp'>链接</a>";
		req.setAttribute("tag", msg);
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}

	private void refresh1(HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		/*
		 * 这些代码其实在实际开发中并不适用，因为数据的输出一般并不由Servlet处理，而是交由jsp处理。
		 */
		resp.setHeader("refresh", "3;url='/day06/register.jsp'");
		resp.getWriter().write("登录成功！页面自动跳转 ,如果页面没有跳转，点击这里 <a href ='/day06/register.jsp'>链接</a>");
	}

	private void refresh(HttpServletResponse resp) throws IOException {
		String data=new Random().nextInt(1000)+"";
		resp.setHeader("refresh", "3");
		resp.getWriter().write(data);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
