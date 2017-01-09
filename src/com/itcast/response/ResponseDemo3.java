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
		 * ʵ�ʿ����У�Ӧ�ô˴��롣
		 * ����(Servlet����)  --->  Jsp����  --->��ת
		 */
		String msg="<meta http-equiv='refresh' content='3;url=/day06/index.jsp'>��¼�ɹ���ҳ���Զ���ת ,���ҳ��û����ת��������� <a href ='/day06/index.jsp'>����</a>";
		req.setAttribute("tag", msg);
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}

	private void refresh1(HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		/*
		 * ��Щ������ʵ��ʵ�ʿ����в������ã���Ϊ���ݵ����һ�㲢����Servlet�������ǽ���jsp����
		 */
		resp.setHeader("refresh", "3;url='/day06/register.jsp'");
		resp.getWriter().write("��¼�ɹ���ҳ���Զ���ת ,���ҳ��û����ת��������� <a href ='/day06/register.jsp'>����</a>");
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
