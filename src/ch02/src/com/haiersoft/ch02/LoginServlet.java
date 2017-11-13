package com.haiersoft.ch02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cookieName = "userName";
		String cookiePwd = "pwd";
		// �������cookie
		Cookie[] cookies = request.getCookies();
		String userName = "";
		String pwd = "";
		String isChecked = "";
		// ���cookie���鲻Ϊnull��˵���������ù�
		// Ҳ����������¼������ôȡ���ϴε�¼���û���������
		if (cookies != null) {
			// ����������ù�cookie��checkbox״̬Ӧ����checked
			isChecked = "checked";
			for (int i = 0; i < cookies.length; i++) {
				// ȡ����¼��
				if (cookies[i].getName().equals(cookieName)) {
					userName = cookies[i].getValue();
				}
				// ȡ������
				if (cookies[i].getName().equals(cookiePwd)) {
					pwd = cookies[i].getValue();
				}
			}
		}
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>\n");
		out.println("<HEAD><TITLE>��¼</TITLE></HEAD>\n");
		out.println("<BODY>\n");
		out.println("<CENTER>\n");
		out.println("	<FORM ACTION='CookieTest'" + " METHOD='POST'>\n");
		out.println("������<INPUT TYPE='TEXT'" + " NAME='UserName' VALUE='"
				+ userName + "'><BR>\n");
		out.println("���룺<INPUT TYPE='PASSWORD' NAME='Pwd' VALUE='" + pwd
				+ "'><BR>\n");
		out.println("�����û���������<INPUT TYPE='CHECKBOX'"
				+ "NAME='SaveCookie' VALUE='Yes' " + isChecked + ">\n");
		out.println("		<BR>\n");
		out.println("		<INPUT TYPE=\"SUBMIT\">\n");
		out.println("	</FORM>\n");
		out.println("</CENTER>\n");
		out.println("</BODY>\n");
		out.println("</HTML>\n");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
