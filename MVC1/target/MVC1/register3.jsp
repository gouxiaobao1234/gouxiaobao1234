<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    $(function(){
        $("#registerBtn").click(function(){
            // 1、获取表单数据
            var username = $("input[name='username']").val();
            var password = $("input[name='password']").val();
            var age = $("input[name='age']").val();

            // 2、构造json格式的字符串
            var requestData = {"username":username , "password": password , "age":age};

            $.ajax({
                url:"${pageContext.request.contextPath}/r/register3",
                type: "POST",
                data: requestData,
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
