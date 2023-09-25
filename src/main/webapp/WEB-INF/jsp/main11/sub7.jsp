<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>

</head>
<body>
<%--main11/sub7?show=ture--%>
<c:choose>

    <c:when test="${not empty moving}">
        <title>Title</title>
        <table>
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
    </c:when>
    <c:when test="${empty moving}">
        <p>다시 입력해주세요.</p>
    </c:when>
</c:choose>
<%--<c:if test="${empty moving}">--%>
<%--    <h1>데이터가 없습니다.</h1>--%>
<%--</c:if>--%>
<%--<c:if test="${!empty moving}">--%>
<%--    <table>--%>
<%--        <style>--%>
<%--          table {--%>
<%--            width: 100%;--%>
<%--            border: 1px solid #444444;--%>
<%--            border-collapse: collapse;--%>
<%--            background: black;--%>
<%--          }--%>
<%--          tr,th,td{--%>
<%--            border: 1px solid #444444;--%>
<%--            padding: 10px;--%>
<%--            text-align: center;--%>
<%--            color: aqua;--%>
<%--          }--%>
<%--          th:first-child, td:first-child {--%>
<%--            border-left: none;--%>
<%--          }--%>
<%--        </style>--%>
<%--    <tr>--%>
<%--        <th>ID</th>--%>
<%--        <th>FIRST NAME</th>--%>
<%--        <th>LAST NAME</th>--%>
<%--        <th>CLASS</th>--%>
<%--        <th>PHONE</th>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${moving}" var="status">--%>
<%--        <tr>--%>
<%--            <td>${status.id}</td>--%>
<%--            <td>${status.firstName}</td>--%>
<%--            <td>${status.lastName}</td>--%>
<%--            <td>${status.className}</td>--%>
<%--            <td>${status.number}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </table>--%>
<%--</c:if>--%>
</body>
</html>
