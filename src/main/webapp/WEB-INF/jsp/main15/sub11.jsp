<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>모델 값 꺼내오기
    <br><c:forEach items="${items}" var="item">
        <li>${item}</li>
    </c:forEach>
</h1>
<h1>세션 값 꺼내오기
    <br><c:forEach items="${sessionScope.items}" var="item">
        <li>${item}</li>
    </c:forEach>
<h1>세션 배열중 하나 꺼내오기
    <br>${sessionScope.items[1]}</h1>
</body>
</html>
