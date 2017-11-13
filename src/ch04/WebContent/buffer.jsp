<%@ page language="java" contentType="text/html; charset=gbk"
	buffer="1kb" autoFlush="false"%>
<HTML>
<HEAD>
<TITLE>BufferºÍautoFlush</TITLE>
</HEAD>
<BODY>
<%
	for (int i = 0; i < 1000; i++) {
		out.println("This is Line " + i);
	}
%>
</BODY>
</HTML>
