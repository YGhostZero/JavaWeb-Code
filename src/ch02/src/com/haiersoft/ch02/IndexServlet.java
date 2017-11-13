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
			// ���counterΪnull��
			// ˵��servlet�������л�û������UserNumber����
			// �˴η���Ϊ��һ�η���
			if (counter == null) {
				counter = new Integer(1);
			} else {
				// ȡ��ԭ����������ֵ����1
				tmp = counter.intValue() + 1;
				counter = new Integer(tmp);
			}
			ctx.setAttribute("UserNumber", counter);
		}
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>��ҳ</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("���ǵ�һҳ<BR>");
		out.println("<a href='UserNumber'>����ͳ��</a>");
		out.println("</BODY></HTML>");
	}
}
