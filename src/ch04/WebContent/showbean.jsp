<%@ page language="java" contentType="text/html; charset=GBK"%>
<html>
<head>
<title>JSP动作</title>
</head>
<body>
<jsp:useBean id="user" class="com.haiersoft.ch04.model.UserBean" scope="request"/>
<jsp:setProperty property="name" name="user" param="loginName"/>
<jsp:setProperty property="pwd" name="user" param="password"/>
用户名：<jsp:getProperty property="name" name="user"/><br/>
密码：<jsp:getProperty property="pwd" name="user"/>
</body>
</html>