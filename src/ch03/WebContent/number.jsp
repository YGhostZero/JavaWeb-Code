<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>ʮ����</title>
</head>
<body>
<%
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
		out.println(i + "&nbsp;&nbsp;");
	}
	out.println("<br>��ʮ�����ĺ�Ϊ��" + sum);
%>
</body>
</html>