<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-10
  Time: 오전 11:15
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
      }
      th{
        background: skyblue;
      }

      table, th, td{
        border: 1px solid black;
      }
    </style>
</head>
<body>
<h4>직원 조회</h4>
<form action="">
    <div>
        검색조건
        <select name="st">
            <option value="lname" ${searchType == "lname" ? "selected" : ""}>Last Name</option>
            <option value="fname" ${searchType == "fname" ? "selected" : ""}>First Name</option>
            <option value="notes" ${searchType == "notes" ? "selected" : ""}>Notes</option>
        </select>
    </div>
    <div>
        검색어
        <input type="text" name="k" value="${keyword}" placeholder="입력해주세요">
    </div>
    <div>
        <button>조회</button>
    </div>
</form>
<table>
    <tr>
        <th>직원 정보</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.FirstName}</td>
            <td>${employee.LastName}</td>
            <td>${employee.Notes}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
