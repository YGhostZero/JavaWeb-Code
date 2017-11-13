package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//创建一个Servlet类，继承HttpServlet  
public class HelloServlet extends HttpServlet {
	// 重写doGet（）
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置响应到客户端的文本类型为HTML
		response.setContentType("text/html");
		// 获取输出流
		PrintWriter out = response.getWriter();
		out.println(" Hello World");
	}
}
