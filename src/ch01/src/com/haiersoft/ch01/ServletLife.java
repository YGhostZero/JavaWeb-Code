package com.haiersoft.ch01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLife extends HttpServlet {
	/**
	 * 构造方法.
	 */
	public ServletLife() {
		super();

	}
	/**
	 * 初始化方法
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化时，init()方法被调用!");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("处理请求时，doGet()方法被调用。");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("处理请求时，doPost()方法被调用。");
	}
	/**
	 * 用于释放资源
	 */
	public void destroy() {
		super.destroy();
		System.out.println("释放系统资源时,destroy()方法被调用!");
	}
}
