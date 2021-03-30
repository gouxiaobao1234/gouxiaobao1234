<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2021/3/11
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--        用户名：${user.username}--%>
<%--        <br/>--%>
<%--        密码：${user.password}--%>
<%--        <br/>--%>
<%--        年龄:${user.age}--%>
<%--        </br>--%>
<%--        家庭住址:<br/>--%>
<%--        <c:forEach items="${user.addresses}" var="address">--%>
<%--            ${address.province}--${address.city} <br/>--%>
<%--        </c:forEach>--%>

        用户名：${user.username}
        <br/>
        密码：${user.password}
        <br/>
        年龄:${user.age}
        </br>
        家庭住址:<br/>
        <c:forEach items="${user.addresses}" var="address">
                ${address.province}--${address.city} <br/>
        </c:forEach>
</body>
</html>
