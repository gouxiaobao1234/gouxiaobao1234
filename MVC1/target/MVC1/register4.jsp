<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.4.js"></script>
<script>
    $(function(){
        $("#registerBtn").click(function(){
            $.ajax({
                url:"${pageContext.request.contextPath}/r/register4",
                type: "POST",
                data: $("#form").serialize(),
                dataType: "json",
                success: function(respData){
                    alert(respData);
                }
            });
        });
    });
</script>
<body>
    <form id="form">
        用户名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="button" id="registerBtn" value="注册"/>
    </form>
</body>
</html>
