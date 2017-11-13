package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//请求转发
public class ForwardServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setAttribute("test","helloworld");
		PrintWriter out = response.getWriter();
		out.println("请求转发前");
		RequestDispatcher rd = request.getRequestDispatcher("/myservlet");
		rd.forward(request, response);
		out.println("请求转发后");
	}
}
