<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-06
  Time: 오후 2:30
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
      .active{
        color: aquamarine;
      }
      .btn{
        cursor: pointer;
        font-size: large;
      }
      .btn:hover{
        background: coral;
      }
      .btn:active{
        background: aqua;
      }
      .btn:visited{
        background: brown;
      }
    </style>
</head>
<body>
<h4>고객 목록 조회</h4>
<table>
    <tr>
        <th>아이디</th>
        <th>이름</th>
    </tr>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
        </tr>
    </c:forEach>
</table>
<div>
    <c:if test="${prevPageNumber >= 1}">
    <a href="/main22/sub3?p=${prevPageNumber}">
        <button class="btn">이전</button></a>
    </c:if>
    <c:forEach begin="${leftPageNumber}" end="${rightPageNumber}" var="pageNumber">

        <a
                <c:if test="${pageNumber == currentPage}">
                    class="active"
                </c:if>
                href="/main22/sub3?p=${pageNumber}">${pageNumber}</a>
    </c:forEach>
    <c:if test="${lastPageNumber >= nextPageNumber}">
    <a href="/main22/sub3?p=${nextPageNumber}">
        <button class="btn">다음</button>
    </a>
    </c:if>
</div>

</body>
</html>
