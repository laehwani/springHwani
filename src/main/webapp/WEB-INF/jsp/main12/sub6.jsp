<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 4:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${empty result}">
    <p>잘못된 검색어입니다.</p>
<a href="/main12/sub5">다시 검색하러가기</a>
</c:if>
<c:if test="${!empty result}">
    <h1>검색 결과</h1>
    <p>${result}</p>
    <a href="/main12/sub5">다시 검색하러가기</a>
</c:if>

</body>
</html>
