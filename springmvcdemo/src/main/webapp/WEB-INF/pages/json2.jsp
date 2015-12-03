<%--
  Created by IntelliJ IDEA.
  User: 齐宇
  Date: 2015/12/3
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.json.js"></script>
    <title>添加用户</title>
    <script type="text/javascript">
        $(function(){
            $.fn.serializeObject = function(){
                var o = {};
                var a = this.serializeArray();
                $.each(a, function(){
                    if (o[this.name]) {
                        if (!o[this.name].push) {
                            o[this.name] = [o[this.name]];
                        }
                        o[this.name].push(this.value || '');
                    }
                    else {
                        o[this.name] = this.value || '';
                    }
                });
                return o;
            };

            $("#form :button").click(function(){
                var jsonuserinfo = $.toJSON($('#form').serializeObject());
                alert(jsonuserinfo);
                jQuery.ajax({
                    type: 'POST',
                    contentType: 'application/json',
                    url: 'user/testJson2',
                    data: jsonuserinfo,
                    dataType: 'json',
                    success: function(data){
                        alert("名字:" + data.name + "年龄:" + data.age);
                    },
                    error: function(){
                        alert("error");
                    }
                });
            });
        });
    </script>
</head>
<body>
<form action="user/addUser" method="post" id="form">
    用户名:<input type="text" id="name" name="name" /><br/>
    年龄:<input type="text" id="age" name="age" />
    <input type="button" value="提交" />
</form>
</body>
</html>