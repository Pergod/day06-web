package com.itcast.request;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

public class RequestDemo1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getHeadersMsg(req);
		getParam(req);
		//应用于文件上传
//		InputStream in=req.getInputStream();
//		int len=0;
//		byte[] buffer=new byte[1024];
//		while ((len=in.read(buffer))!=-1) {
//			System.out.println(new String(buffer, 0, len));
//		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		getParam1(req);
		//同名数据,实际开发应用
		Map<String, String[]> map=req.getParameterMap();
		User user=new User();
		try {
			BeanUtils.populate(user, map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		user.toString();
	}

	private void getParam(HttpServletRequest req) {
		String name=(String)req.getParameter("name");
		//数据检查
		if (name!=null||!name.equals("")) {
			System.out.println(name);
		}
	}
	
	private void getParam1(HttpServletRequest req) {
		String name=(String)req.getParameter("username");
		System.out.println(name);
		String password=(String)req.getParameter("password");
		System.out.println(password);
	}
	private void getHeadersMsg(HttpServletRequest req) {
		String encoding=(String)req.getHeader("accept-encoding");
		System.out.println(encoding);
		Enumeration<String> headers=req.getHeaders("accept-encoding");
		while (headers.hasMoreElements()) {
			System.out.println(headers.nextElement());
		}
		
		Enumeration<String> names=req.getHeaderNames();
		while (names.hasMoreElements()) {
			String name=names.nextElement();
			String value=req.getHeader(name);
			System.out.println(name+":"+value);
		}
	}
}
