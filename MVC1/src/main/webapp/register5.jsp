<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    $(function(){
        $("#registerBtn").click(function(){
            $.ajax({
                url:"${pageContext.request.contextPath}/r/register5",
                type: "POST",
                data: $("#form").serialize(),
                dataType: "json",
                success: function(respData){
                    console.log(respData.data.username)
                    console.info(respData.code)
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
