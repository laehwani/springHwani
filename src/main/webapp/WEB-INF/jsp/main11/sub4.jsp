<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--요청파라미터 age--%>
<%--age 가 20보다 크거나 같으면--%>
<h1>20살 이상부터 투표가 가능합니다.</h1>
<c:if test="${!empty param.age}">
    <c:if test="${param.age ge 20}" var="isAge">
        <p> 투표가능합니다. </p>
    </c:if>
    <c:if test="${!isAge}">
        <p> 투표 가능한 나이가 아닙니다. </p>
    </c:if>
</c:if>
<c:if test="${empty param.age}">
    <p>age 값을 입력해주세요</p>
</c:if>


</body>
</html>
