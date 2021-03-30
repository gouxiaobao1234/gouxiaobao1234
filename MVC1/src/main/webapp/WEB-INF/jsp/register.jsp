<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2021/3/9
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>用户注册</h1>
<%--        <form action="${pageContext.request.contextPath}/user/register1" method="post">--%>
<%--            用户名：<input type="text" name="username"><br/>--%>
<%--            密码：<input type="text" name="password"><br/>--%>
<%--            年龄：<input type="text" name="age"><br/>--%>
<%--            <input type="submit" value="注册"/>--%>
<%--        </form>--%>

<%--        <form action="${pageContext.request.contextPath}/user/register2" method="post">--%>
<%--            用户名：<input type="text" name="username"><br/>--%>
<%--            密码：<input type="text" name="password"><br/>--%>
<%--            年龄：<input type="text" name="age"><br/>--%>
<%--            省份1: <input type="text" name="addresses.province"><br/>--%>
<%--            城市1：<input type="text" name="addresses.city"><br/>--%>
<%--            <input type="submit" value="注册"/>--%>
<%--        </form>--%>
<%--        <form action="${pageContext.request.contextPath}/user/register3" method="post">--%>
<%--            用户名：<input type="text" name="username"><br/>--%>
<%--            密码：<input type="text" name="password"><br/>--%>
<%--            年龄：<input type="text" name="age"><br/>--%>
<%--            省份1: <input type="text" name="addresses[0].province"><br/>--%>
<%--            城市1：<input type="text" name="addresses[0].city"><br/>--%>
<%--            省份2: <input type="text" name="addresses[1].province"><br/>--%>
<%--            城市2：<input type="text" name="addresses[1].city"><br/>--%>
<%--            <input type="submit" value="注册"/>--%>
<%--        </form>--%>

<%--<form action="${pageContext.request.contextPath}/user/register4" method="post">--%>
<%--    用户名：<input type="text" name="username"><br/>--%>
<%--    密码：<input type="text" name="password"><br/>--%>
<%--    年龄：<input type="text" name="age"><br/>--%>
<%--    省份1: <input type="text" name="addressMap['address1'].province"><br/>--%>
<%--    城市1：<input type="text" name="addressMap['address1'].city"><br/>--%>
<%--    省份2: <input type="text" name="addressMap['address2'].province"><br/>--%>
<%--    城市2：<input type="text" name="addressMap['address2'].city"><br/>--%>
<%--    <input type="submit" value="注册"/>--%>
<%--</form>--%>
<%--<form action="${pageContext.request.contextPath}/user/register5" method="post">--%>
<%--    用户名：<input type="text" name="username"><br/>--%>
<%--    密码：<input type="text" name="password"><br/>--%>
<%--    年龄：<input type="text" name="age"><br/>--%>
<%--    出生日期: <input type="text" name="born"><br/>--%>
<%--    <input type="submit" value="注册"/>--%>
<%--</form>--%>

<%--<form action="${pageContext.request.contextPath}/user/register6" method="post">--%>
<%--    用户名：<input type="text" name="username"><br/>--%>
<%--    密码：<input type="text" name="password"><br/>--%>
<%--    年龄：<input type="text" name="age"><br/>--%>
<%--    出生日期: <input type="text" name="born"><br/>--%>
<%--    <input type="submit" value="注册"/>--%>
<%--</form>--%>

<form action="${pageContext.request.contextPath}/user/register7" method="post">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    年龄：<input type="text" name="age"><br/>
    出生日期: <input type="text" name="born"><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
