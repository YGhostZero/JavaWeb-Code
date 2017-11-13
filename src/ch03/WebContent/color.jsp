<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>颜色</title>
</head>
<body>
<%--声明两种颜色全局 变量--%>
<%!private String color1 = "EBEBEB";
	private String color2 = "F8F8F8";%>
<!-- Table表格 -->
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
		<td>姓名<%=i%></td>
		<td><%=i%></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>