<%--
  Created by IntelliJ IDEA.
  User: 齐宇
  Date: 2015/11/4
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src=${pageContext.request.contextPath}/js/jquery.min.js></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <title>PNINFO查询界面</title>
</head>

<form action="/search.json" method="POST">


    P/n:<input type="text" name="p_pn" id="p_pn">
    S/n:<input type="text" name="p_sn" id="p_sn">
    状态:
    <select name="p_avail1" id="p_avail1">
        <option value="  "></option>
        <option value="IN">IN</option>
        <option value="OH">OH</option>
        <option value="US">US</option>
        <option value="CS">CS</option>
        <option value="SE">SE</option>
        <option value="LO">LO</option>
        <option value="SO">SO</option>
        <option value="SC">SC</option>
        <option value="EX">EX</option>
        <option value="UN">UN</option>
        <option value="QA">QA</option>
    </select>
    <select type="text" name="p_avail2" id="p_avail2">
        <option value="  "></option>
        <option value="IN">IN</option>
        <option value="OH">OH</option>
        <option value="US">US</option>
        <option value="CS">CS</option>
        <option value="SE">SE</option>
        <option value="LO">LO</option>
        <option value="SO">SO</option>
        <option value="SC">SC</option>
        <option value="EX">EX</option>
        <option value="UN">UN</option>
        <option value="QA">QA</option>
    </select>
    <select type="text" name="p_avail3" id="p_avail3">
        <option value="  "></option>
        <option value="IN">IN</option>
        <option value="OH">OH</option>
        <option value="US">US</option>
        <option value="CS">CS</option>
        <option value="SE">SE</option>
        <option value="LO">LO</option>
        <option value="SO">SO</option>
        <option value="SC">SC</option>
        <option value="EX">EX</option>
        <option value="UN">UN</option>
        <option value="QA">QA</option>
    </select>

    机号:<input type="text" name="p_msn" id="p_msn">
    B/n:<input type="text" name="p_bn" id="p_bn">
    所有者:<input type="text" name="p_owner" id="p_owner">
    航站:<input type="text" name="p_station" id="p_station">
    库房:<input type="text" name="p_stock" id="p_stock">
    特定件号：<input type="radio" name="p_spec" value="0" checked>否
    <input type="radio" name="p_spec" value="1"> 是
    <br/>
    单项替换件号:<input type="radio" name="p_sup" value="0" checked>否
    <input type="radio" name="p_sup" value="1"> 是
    <br/>
    交换件:<input type="radio" name="p_exch" value="0" checked>否
    <input type="radio" name="p_exch" value="1"> 是
    <br/>
    报废件:<input type="radio" name="p_scrap" value="0" checked>否
    <input type="radio" name="p_scrap" value="1"> 是
    <br/>
    数量>0:<input type="radio" name="p_qty" value="0" checked>否
    <input type="radio" name="p_qty" value="1"> 是
    <br/>



    排序:<select name="p_orderby" id="p_orderby">
    <option value=""></option>
    <option value="Avail">Avail</option>
    <option value="MSN">MSN</option>
    <option value="P/n - S/n">P/n - S/n</option>
</select>

    <input type="submit" value="搜索">

</form>
</body>
</html>
