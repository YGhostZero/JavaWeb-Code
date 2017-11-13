package com.haiersoft.ch01;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpHeadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 "
				+ "Transitional//EN\">");
		buffer.append("<html>");
		buffer.append("<head><title>");
		String title = "请求表头信息";
		buffer.append(title);
		buffer.append("</title></head>");
		buffer.append("<body>");
		buffer.append("<h1 align='center'>" + title + "</h1>");
		buffer.append("<b>Request Method: </b>");
		buffer.append(request.getMethod() + "<br/>");
		buffer.append("<b>Request URL: </b>");
		buffer.append(request.getRequestURI() + "<br/>");
		buffer.append("<b>Request Protocol: </b>");
		buffer.append(request.getProtocol() + "<br/>");
		buffer.append("<b>Request Local: </b>");
		buffer.append(request.getLocale() + "<br/><br/>");
		buffer.append("<table border='1' align='center'>");
		buffer.append("<tr bgcolor='#FFAD00'>");
		buffer.append("<th>Header Name</th><th>Header Value</th>");
		buffer.append("</tr>");
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			buffer.append("<tr>");
			buffer.append("<td>" + headerName + "</td>");
			buffer.append("<td>" + request.getHeader(headerName) + "</td>");
			buffer.append("</tr>");
		}
		buffer.append("</body>");
		buffer.append("</html>");
		out.println(buffer.toString());
	}
}
