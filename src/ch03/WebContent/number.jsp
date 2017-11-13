<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>十个数</title>
</head>
<body>
<%
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
		out.println(i + "&nbsp;&nbsp;");
	}
	out.println("<br>这十个数的和为：" + sum);
%>
</body>
</html>