<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>JSP����</title>
</head>
<body>
<jsp:useBean id="user" class="com.haiersoft.ch04.model.UserBean" scope="request"/>
<jsp:setProperty property="name" name="user" param="loginName"/>
<jsp:setProperty property="pwd" name="user" param="password"/>
�û�����<jsp:getProperty property="name" name="user"/><br/>
���룺<jsp:getProperty property="pwd" name="user"/>
</body>
</html>