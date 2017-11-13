<%@ page language="java" contentType="text/html; charset=GBK"%>
<%!private int a = 34;
	private int b = 40;

	public int max(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}%>
<html>
<head>
<title>最大数</title>
</head>
<body>
<%=a%>和<%=b%>中最大的数是<%=max(a, b)%>
</body>
</html>
