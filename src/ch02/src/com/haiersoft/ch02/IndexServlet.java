package com.haiersoft.ch02;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class IndexServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		synchronized (this) {
			Integer counter = (Integer) ctx.getAttribute("UserNumber");
			int tmp = 0;
			// 如果counter为null，
			// 说明servlet上下文中还没有设置UserNumber属性
			// 此次访问为第一次访问
			if (counter == null) {
				counter = new Integer(1);
			} else {
				// 取出原来计数器的值加上1
				tmp = counter.intValue() + 1;
				counter = new Integer(tmp);
			}
			ctx.setAttribute("UserNumber", counter);
		}
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>首页</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("这是第一页<BR>");
		out.println("<a href='UserNumber'>人数统计</a>");
		out.println("</BODY></HTML>");
	}
}
