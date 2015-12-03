<%--
  Created by IntelliJ IDEA.
  User: 齐宇
  Date: 2015/12/3
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic DataGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/demo.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
</head>
<body>
<h2>Basic DataGrid</h2>
<p>The DataGrid is created from markup, no JavaScript code needed.</p>
<div style="margin:20px 0;"></div>

<table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
       data-options="singleSelect:true,collapsible:true,url:'${pageContext.request.contextPath}/css/table.json',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'vendor_bn',width:80">vendor_bn</th>
        <th data-options="field:'inventorylock',width:100">rejectiontext</th>
        <th data-options="field:'rejectiontext',width:80,align:'right'">rejectiontext</th>
        <th data-options="field:'supplier',width:80,align:'right'">supplier</th>
        <th data-options="field:'pn_class',width:250">pn_class</th>
        <th data-options="field:'priceeach',width:60,align:'center'">priceeach</th>

<%--        <th data-options="field:'itemid',width:80">Item ID</th>
        <th data-options="field:'productid',width:100">Product</th>
        <th data-options="field:'listprice',width:80,align:'right'">List Price</th>
        <th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
        <th data-options="field:'attr1',width:250">Attribute</th>
        <th data-options="field:'status',width:60,align:'center'">Status</th>--%>

    </tr>
    </thead>
</table>

</body>
</html>
