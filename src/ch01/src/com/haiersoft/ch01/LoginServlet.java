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
		// 将输入转换为中文
		request.setCharacterEncoding("GBK");
		// 设置输出为中文
		response.setContentType("text/html;charset=GBK");
		// 获取输出流
		PrintWriter out = response.getWriter();
		// 获取表单数据
		String pass = request.getParameter("password");
		String user = request.getParameter("loginName");
		if ("haier".equals(user) && "soft".equals(pass)) {
			out.println("登录成功!");
		} else {
			out.println("登录失败!");
		}
	}
}
