package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置响应到客户端的文本类型为HTML
		response.setContentType("text/html; charset=UTF-8");
		// 获取输出流
		PrintWriter out = response.getWriter();
		String test =(String)request.getAttribute("test");
		out.println("重定向和请求转发");
		out.println(test);
	}
}
