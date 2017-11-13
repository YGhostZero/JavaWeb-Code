package com.haiersoft.ch02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cookieName = "userName";
		String cookiePwd = "pwd";
		// 获得所有cookie
		Cookie[] cookies = request.getCookies();
		String userName = "";
		String pwd = "";
		String isChecked = "";
		// 如果cookie数组不为null，说明曾经设置过
		// 也就是曾经登录过，那么取出上次登录的用户名，密码
		if (cookies != null) {
			// 如果曾经设置过cookie，checkbox状态应该是checked
			isChecked = "checked";
			for (int i = 0; i < cookies.length; i++) {
				// 取出登录名
				if (cookies[i].getName().equals(cookieName)) {
					userName = cookies[i].getValue();
				}
				// 取出密码
				if (cookies[i].getName().equals(cookiePwd)) {
					pwd = cookies[i].getValue();
				}
			}
		}
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>\n");
		out.println("<HEAD><TITLE>登录</TITLE></HEAD>\n");
		out.println("<BODY>\n");
		out.println("<CENTER>\n");
		out.println("	<FORM ACTION='CookieTest'" + " METHOD='POST'>\n");
		out.println("姓名：<INPUT TYPE='TEXT'" + " NAME='UserName' VALUE='"
				+ userName + "'><BR>\n");
		out.println("密码：<INPUT TYPE='PASSWORD' NAME='Pwd' VALUE='" + pwd
				+ "'><BR>\n");
		out.println("保存用户名和密码<INPUT TYPE='CHECKBOX'"
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
