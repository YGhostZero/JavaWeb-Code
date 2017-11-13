package com.haiersoft.ch02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitParamServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		// 获得ServletContext对象
		ServletContext ctx = this.getServletContext();
		// 通过ServletContext获得web.xml中设置的初始化参数
		String serverName = ctx.getInitParameter("serverName");
		String dbInstance = ctx.getInitParameter("dbInstance");
		String userName = ctx.getInitParameter("userName");
		String password = ctx.getInitParameter("userPwd");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>");
		out.println("读取初始化参数</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("服务器：" + serverName + "<br>");
		out.println("数据库实例：" + dbInstance + "<br>");
		out.println("用户名称：" + userName + "<br>");
		out.println("用户密码：" + password + "<br>");
		out.println("</BODY></HTML>");
	}
}
