<%--
  Created by IntelliJ IDEA.
  User: 齐宇
  Date: 2015/12/4
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/demo.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <title>PNINFO查询界面</title>
    <script>
        $(document).ready(function(){
            loadGrid();
        });
        var alist={};
    function ss(){
        var baseUrl = "/search";
        var queryData = {};
        var pn = $("input[name='p_pn']").val();
        queryData.p_pn = pn;
        console.log(queryData);
        $.ajax({
            url: baseUrl,
            type: "Post",
            data: queryData,
            dataType: "JSON",
            timeout: 60000,
            success: function( response ) {
                console.log(response);
                alist.total = response.pnifocurBOList.length;
                alist.rows= response.pnifocurBOList;
                console.log(alist);
                $("#result").datagrid('load',alist)
            },
            error: function( response) {
                console.log(response);
            },
            complete:function(response){

            }
        });
    };

    </script>
</head>

<form id="inputform"  method="POST">


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



</form>
<button id="ajax-btn" onclick="ss();">ajaxSearch</button>

<div class="result">

    <table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px">
        <thead>
        <tr>
            <th data-options="field:'vendor',width:80">vendor_bn</th>
            <th data-options="field:'inventorylock',width:100">rejectiontext</th>
            <th data-options="field:'rejectiontext',width:80,align:'right'">rejectiontext</th>
            <th data-options="field:'supplier',width:80,align:'right'">supplier</th>


            <%--        <th data-options="field:'itemid',width:80">Item ID</th>
                    <th data-options="field:'productid',width:100">Product</th>
                    <th data-options="field:'listprice',width:80,align:'right'">List Price</th>
                    <th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
                    <th data-options="field:'attr1',width:250">Attribute</th>
                    <th data-options="field:'status',width:60,align:'center'">Status</th>--%>

        </tr>
        </thead>
    </table>





</div>




</div>





</body>
</html>
