<%--
  Created by IntelliJ IDEA.
  User: 齐宇
  Date: 2015/11/24
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>结果</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div>
    <table class="table">
        <p>${res.p_pnid}</p>
        <tbody>
        <tr>
            <td>VENDOR_BN    </td>
            <td>INVENTORYLOCK</td>
            <td>REJECTIONTEXT</td>
            <td>SUPPLIER     </td>
            <td>PN_CLASS     </td>
            <td>PRICEEACH    </td>
            <td>STOCK        </td>
            <td>OWNER        </td>
            <td>REJECTCODE   </td>
            <td>EXPIRYDATE   </td>
            <td>RELATION     </td>
            <td>RESERVED_QTY </td>
            <td>ORDERID      </td>
            <td>SERIALIZED   </td>
            <td>BN           </td>
            <td>QTY          </td>
            <td>ORDERTYPE    </td>
            <td>COC          </td>
            <td>ACC_DATE     </td>
            <td>PARTID       </td>
            <td>ORDERSTATE   </td>
            <td>PARTALTTYPE  </td>
            <td>ORDERNO      </td>
            <td>LOCATION     </td>
            <td>PN           </td>
            <td>PN_LEVEL     </td>
            <td>STORAGEUNIT  </td>
            <td>ORGANISATION </td>
            <td>VENDOR       </td>
        </tr>
        <c:forEach items="${res.pnifocurBOList}" var="p">
        <tr>
            <td>${p.vendor}</td>
            <td>${p.inventorylock}</td>
            <td>${p.rejectiontext}</td>
            <td>${p.supplier}</td>
            <td>${p.pn_class}</td>
            <td>${p.priceeach}</td>
            <td>${p.stock}</td>
            <td>${p.owner}</td>
            <td>${p.rejectcode}</td>
            <td>${p.expirydate}</td>
            <td>${p.relation}</td>
            <td>${p.reserved_qty}</td>
            <td>${p.orderid}</td>
            <td>${p.serialized}</td>
            <td>${p.bn}</td>
            <td>${p.qty}</td>
            <td>${p.ordertype}</td>
            <td>${p.coc}</td>
            <td>${p.acc_date}</td>
            <td>${p.partid}</td>
            <td>${p.orderstate}</td>
            <td>${p.partalttype}</td>
            <td>${p.orderno}</td>
            <td>${p.location}</td>
            <td>${p.pn}</td>
            <td>${p.pn_level}</td>
            <td>${p.storageunit}</td>
            <td>${p.organisation}</td>
            <td>${p.vendor}</td>

        </tr>
        </c:forEach>
        </tbody>
    </table>
<%--    <table>
    <c:forEach items="${res}" var="o">
    <tr>
        <td>${o.p_avail1}</td>
    </tr>
    </c:forEach>
    </table>--%>

</div>
</body>
</html>
