<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>第一个JSP页面</title>
</head>
<body>
<h1 align="center">欢迎！</h1>
<%
	java.util.Date now = new java.util.Date();
	out.println("当前时间是：" + now);
%>
</body>
</html>