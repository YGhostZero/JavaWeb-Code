package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ������Ӧ���ͻ��˵��ı�����ΪHTML
		response.setContentType("text/html; charset=UTF-8");
		// ��ȡ�����
		PrintWriter out = response.getWriter();
		String test =(String)request.getAttribute("test");
		out.println("�ض��������ת��");
		out.println(test);
	}
}
