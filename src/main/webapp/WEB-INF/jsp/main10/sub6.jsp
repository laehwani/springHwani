<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오후 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


</body>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
    border-collapse: collapse;
    background: black;
  }
  tr,th,td{
    border: 1px solid #444444;
    padding: 10px;
    text-align: center;
    color: aqua;
  }
  th:first-child, td:first-child {
    border-left: none;
  }
</style>
<table>
    <tr>
        <th>ID</th>
        <th>FIRST NAME</th>
        <th>LAST NAME</th>
        <th>CLASS</th>
        <th>PHONE</th>
    </tr>
    <c:forEach items="${moving}" var="status">
        <tr>
            <td>${status.id}</td>
            <td>${status.firstName}</td>
            <td>${status.lastName}</td>
            <td>${status.className}</td>
            <td>${status.number}</td>
        </tr>
    </c:forEach>
</table>

</html>
