package com.itcast.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path=this.getServletConfig().getServletContext().getRealPath("/source/什么.jpg");
		String filename=path.substring(path.lastIndexOf("\\")+1);
		
		FileInputStream in=new FileInputStream(path);
		OutputStream out=resp.getOutputStream();
//		resp.setHeader("content-disposition", "attachment;filename="+filename);
		/*
		 * 处理中文文件名时，需采用以下方法
		 */
		resp.setHeader("content-disposition", "attachment;filename="+URLEncoder.encode(filename, "UTF-8"));
		byte[] bs=new byte[1024];
		int len=0;
		try {
			while ((len=in.read(bs))!=-1) {
				out.write(bs, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (out!=null) {
				out.close();
			}
			if (in!=null) {
				in.close();
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
