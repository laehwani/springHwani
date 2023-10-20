<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-19
  Time: 오후 5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="background-color: skyblue">
    ${message}
</div>
<h3> 상품 조회 </h3>
<form action="/main31/sub100">
    검색
    <select name="type" id="">
        <option value="1">상품번호</option>
        <option value="2">상품명</option>
    </select>
    상품번호
    <select name="productId" multiple>
        <c:forEach items="${productIdList}" var="productId">
            <option value="${productId}">${productId}</option>
        </c:forEach>
    </select>
    상품명
<%--    <select name="productName" multiple>--%>
<%--        <c:forEach items="${productName}" var="productName">--%>
<%--            <option value="${productName}">${productName}</option>--%>
<%--        </c:forEach>--%>
    </select>
    <button>조회</button>
</form>
<hr>

<%--<table>--%>
<%--    <tr>--%>
<%--        <th>상품번호</th>--%>
<%--        <th>상품이름</th>--%>
<%--        <th>가 격</th>--%>
<%--        <th>고객번호</th>--%>
<%--        <th>구매고객</th>--%>
<%--        <th>구매날짜</th>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${productList}" var="products">--%>
<%--        <tr>--%>
<%--            <td>${products.id}</td>--%>
<%--            <td>${products.name}</td>--%>
<%--            <td>${products.price}</td>--%>
<%--            <td>${products.customerId}</td>--%>
<%--            <td>${products.customerName}</td>--%>
<%--            <td>${products.orderDate}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

</body>
</html>
