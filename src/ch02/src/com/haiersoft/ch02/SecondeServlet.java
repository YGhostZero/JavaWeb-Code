package com.haiersoft.ch02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SecondeServlet extends HttpServlet {

	public SecondeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Object obj = request.getAttribute("request_param");
		String request_param = null;
		if (obj != null) {
			request_param = obj.toString();
		} else {
			request_param = "null";
		}
		HttpSession session = request.getSession();
		Object obj2 = session.getAttribute("session_param");
		String session_param = null;
		if (obj2 != null) {
			session_param = obj2.toString();
		} else {
			session_param = "null";
		}

		response.setContentType("text/html; charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body >");
		out.println("<h2>请求对象中的参数是 :" + request_param + "</h2>");
		out.println("<h2>Session对象中的参数是 :" + session_param
				+ "</h2></body></html>");

	}

}
