<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>��ɫ</title>
</head>
<body>
<%--����������ɫȫ�� ����--%>
<%!private String color1 = "EBEBEB";
	private String color2 = "F8F8F8";%>
<!-- Table��� -->
<table border="1" align="center">
	<%
		for (int i = 11; i < 16; i++) {
			String color = "";
			if (i % 2 == 0) {
				color = color1;
			} else {
				color = color2;
			}
	%>
	<tr bgcolor="<%=color%> ">
		<td>����<%=i%></td>
		<td><%=i%></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>