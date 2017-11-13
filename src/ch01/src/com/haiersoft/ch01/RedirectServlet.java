package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//重定向
public class RedirectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		//获取输出流
		PrintWriter out = response.getWriter();		
		out.println("重定向前");
		request.setAttribute("test","helloworld");
		response.sendRedirect(request.getContextPath() + "/myservlet");
		out.println("重定向后");
	}
}
