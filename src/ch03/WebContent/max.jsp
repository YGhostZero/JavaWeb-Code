<%@ page language="java" contentType="text/html; charset=GBK"%>
<%!private int a = 34;
	private int b = 40;

	public int max(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}%>
<html>
<head>
<title>�����</title>
</head>
<body>
<%=a%>��<%=b%>����������<%=max(a, b)%>
</body>
</html>
