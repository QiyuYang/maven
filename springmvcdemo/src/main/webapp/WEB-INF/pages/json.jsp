<%--
  Created by IntelliJ IDEA.
  User: 齐宇
  Date: 2015/12/3
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <title>添加用户</title>
    <script type="text/javascript">
        $(function(){
            $("form :button").click(function(){
                $.ajax({
                    type: "POST",
                    url: "user/testJson",
                    success:function(data){
                        alert("名字:" + data.name + "年龄:" + data.age);
                    }
                });
            });
        });
    </script>
</head>
<body>
<form action="user/addUser" method="post">
    用户名:<input type="text" id="name" name="name" /><br/>
    年龄:<input type="text" id="age" name="age" />
    <input type="button" value="提交" />
</form>
</body>
</html>