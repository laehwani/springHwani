<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> jstl if tag </h1>
<c:if test="true">
    <p>출력😎😎</p>
</c:if>
<c:if test="false">
    <p>출력안됨😎😎</p>
</c:if>
<hr>
<c:if test="${param.name eq 'hwan'}">
    <p>hello hwan</p>
</c:if>
<hr>
<h3> var 속성 : test의 연산결과 저장</h3>
<c:if test="${param.name eq 'hwan'}" var="isHwan">
    <p>hello hwan</p>
</c:if>
<c:if test="${!isHwan}">
    <p> hwan 이 아님</p>
</c:if>
</body>
</html>
