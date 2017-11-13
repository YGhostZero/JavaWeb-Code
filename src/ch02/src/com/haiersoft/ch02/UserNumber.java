package com.haiersoft.ch02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class UserNumber extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		Integer counter = (Integer) ctx.getAttribute("UserNumber");

		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>访问人数统计</TITLE></HEAD>");
		out.println("<BODY>");

		if (counter != null) {
			out.println("已经有" + counter.intValue() + "人次访问本网站！");
		} else {
			out.println("你是第一个访问本网站的！");
		}
		out.println("</BODY></HTML>");
	}
}
