<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2021/3/11
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user2/register" method="post">
        用户名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
