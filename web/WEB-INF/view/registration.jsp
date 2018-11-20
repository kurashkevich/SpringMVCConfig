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
</head>
<body>

<!-- commandName="user": Имя переданного объекта-->
<!--  action="check-user" : Указывает куда будем переходить после сабмита формы-->
<!-- Форма принимает пустой объект изера, сабмит формы посылает запрос чек-юзер, параметры записываются в модель аттрибут-->
<form:form method="POST" action="check-user"
           modelAttribute="user">
    <form:label path="email">email</form:label>
    <form:input path="email" />

    <form:label path="pass">pass</form:label>
    <form:input path="pass" />

    <input type="submit" value="Submit" />
</form:form>

<a href="/welcome">back</a>
<p></p>

</body>
</html>
