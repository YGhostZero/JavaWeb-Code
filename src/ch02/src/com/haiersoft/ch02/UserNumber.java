package com.haiersoft.ch02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class UserNumber extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		Integer counter = (Integer) ctx.getAttribute("UserNumber");

		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>��������ͳ��</TITLE></HEAD>");
		out.println("<BODY>");

		if (counter != null) {
			out.println("�Ѿ���" + counter.intValue() + "�˴η��ʱ���վ��");
		} else {
			out.println("���ǵ�һ�����ʱ���վ�ģ�");
		}
		out.println("</BODY></HTML>");
	}
}
