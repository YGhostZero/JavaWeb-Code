package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//����һ��Servlet�࣬�̳�HttpServlet  
public class HelloServlet extends HttpServlet {
	// ��дdoGet����
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ������Ӧ���ͻ��˵��ı�����ΪHTML
		response.setContentType("text/html");
		// ��ȡ�����
		PrintWriter out = response.getWriter();
		out.println(" Hello World");
	}
}
