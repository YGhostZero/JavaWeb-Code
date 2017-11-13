package com.haiersoft.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	public FirstServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//设置请求的编码字符为GBK
		request.setCharacterEncoding("GBK");
		//设置响应的文本类型为html,编码字符为GBK
		response.setContentType("text/html; charset=GBK");
		PrintWriter out = response.getWriter();
		//获取表单数据
		String str = request.getParameter("count");
		request.setAttribute("request_param", str);
		HttpSession session = request.getSession();
		session.setAttribute("session_param", str);	
		//out.println("<a href='s2'>下一页</a>");
		out.println("<a href="+response.encodeURL("s2")+">下一页</a>");
	}

}
