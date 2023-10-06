<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-05
  Time: 오후 5:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>address</td>
        <td>country</td>
    </tr>
    <c:forEach items="${supplyList}" var="country">
       <tr>
           <td>${country.id}</td>
           <td>${country.name}</td>
           <td>${country.address}</td>
           <td>${country.country}</td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
