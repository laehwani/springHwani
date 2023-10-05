<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-04
  Time: 오후 3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
      table{
        border-collapse: collapse;
        border: 1px solid black;
        width: 100%
      }
      th, td {
        border: 1px solid black;
        text-align: center;
      }
      th{
        background-color: aquamarine;
      }
    </style>
</head>
<body>
<table>
<tr>
    <th>ID</th>
    <th>NAME</th>
    <th>UNIT</th>
    <th>PRICE</th>
</tr>
<c:forEach items="${productList}" var="product" >
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.unit}</td>
        <td>${product.price}</td>
    </tr>
    </c:forEach>
</body>
</html>
