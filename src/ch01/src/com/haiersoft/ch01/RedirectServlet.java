package com.haiersoft.ch01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//�ض���
public class RedirectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		//��ȡ�����
		PrintWriter out = response.getWriter();		
		out.println("�ض���ǰ");
		request.setAttribute("test","helloworld");
		response.sendRedirect(request.getContextPath() + "/myservlet");
		out.println("�ض����");
	}
}
