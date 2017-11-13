package com.haiersoft.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // ���һ����ͻ��������ݵ��������
		response.setContentType("text/html; charset=GBK");// ������Ӧ��MIME���͡�

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		response.setHeader("Refresh", "1"); // ����Refresh ��ֵ��
		out.println("����ʱ����:");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		out.println("<br/>" + sdf.format(new Date()));
		out.println("</body>");
		out.println("</html>");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
