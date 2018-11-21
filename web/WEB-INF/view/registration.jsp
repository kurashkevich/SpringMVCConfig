<%--
  Created by IntelliJ IDEA.
  User: Vladislav_K
  Date: 20.11.2018
  Time: 8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <style>
        <%@include file="/resources/css/main.css"%>
    </style>
</head>
<body>

<!-- commandName="user": Имя переданного объекта-->
<!--  action="check-user" : Указывает куда будем переходить после сабмита формы-->
<!-- Форма принимает пустой объект изера, сабмит формы посылает запрос чек-юзер, параметры записываются в модель аттрибут
    Объект user записывается в контекст приложения Spring MVC
-->
<form:form method="POST" action="check-user"
           modelAttribute="user">
    <div><form:label path="email">email</form:label></div>
    <div><form:input path="email"/></div>
    <div><form:label path="pass">pass</form:label></div>
    <div><form:input path="pass"/></div>
    <div><form:errors path="pass" class="error"/></div>

    <div>
        <input type="submit" value="Submit"/>
    </div>
</form:form>

<a href="/welcome">back</a>
<p>asdad</p>

</body>
</html>
