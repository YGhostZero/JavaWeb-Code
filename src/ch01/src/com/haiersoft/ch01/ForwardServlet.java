package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//����ת��
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
		out.println("����ת��ǰ");
		RequestDispatcher rd = request.getRequestDispatcher("/myservlet");
		rd.forward(request, response);
		out.println("����ת����");
	}
}
