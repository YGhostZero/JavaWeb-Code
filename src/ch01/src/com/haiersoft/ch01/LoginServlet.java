package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ������ת��Ϊ����
		request.setCharacterEncoding("GBK");
		// �������Ϊ����
		response.setContentType("text/html;charset=GBK");
		// ��ȡ�����
		PrintWriter out = response.getWriter();
		// ��ȡ������
		String pass = request.getParameter("password");
		String user = request.getParameter("loginName");
		if ("haier".equals(user) && "soft".equals(pass)) {
			out.println("��¼�ɹ�!");
		} else {
			out.println("��¼ʧ��!");
		}
	}
}
