<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Vladislav_K
  Date: 19.11.2018
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file="/resources/css/main.css"%>
    </style>
</head>
<body>
    <h1>${msg}</h1>
    <p>Для продолжения работы Вам необходимо пройти регистрацию или войти</p>
    <a href="/registration/newUser">Registration</a>
    <p></p>
    <a href="/registration">sign in</a>
</body>
</html>
