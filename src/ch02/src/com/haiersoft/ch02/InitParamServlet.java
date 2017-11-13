package com.haiersoft.ch02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitParamServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		// ���ServletContext����
		ServletContext ctx = this.getServletContext();
		// ͨ��ServletContext���web.xml�����õĳ�ʼ������
		String serverName = ctx.getInitParameter("serverName");
		String dbInstance = ctx.getInitParameter("dbInstance");
		String userName = ctx.getInitParameter("userName");
		String password = ctx.getInitParameter("userPwd");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>");
		out.println("��ȡ��ʼ������</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("��������" + serverName + "<br>");
		out.println("���ݿ�ʵ����" + dbInstance + "<br>");
		out.println("�û����ƣ�" + userName + "<br>");
		out.println("�û����룺" + password + "<br>");
		out.println("</BODY></HTML>");
	}
}
