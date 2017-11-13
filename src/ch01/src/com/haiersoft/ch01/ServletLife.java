package com.haiersoft.ch01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLife extends HttpServlet {
	/**
	 * ���췽��.
	 */
	public ServletLife() {
		super();

	}
	/**
	 * ��ʼ������
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("��ʼ��ʱ��init()����������!");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��������ʱ��doGet()���������á�");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��������ʱ��doPost()���������á�");
	}
	/**
	 * �����ͷ���Դ
	 */
	public void destroy() {
		super.destroy();
		System.out.println("�ͷ�ϵͳ��Դʱ,destroy()����������!");
	}
}
