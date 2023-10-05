<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-04
  Time: 오후 4:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
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
        <th>Name</th>
        <th>Address</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${suppliyList}" var="supplier">
        <tr>
            <td>${supplier.id}</td>
            <td>${supplier.name}</td>
            <td>${supplier.address}</td>
            <td>${supplier.country}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
