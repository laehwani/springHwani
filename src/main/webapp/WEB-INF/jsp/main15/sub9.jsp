<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${foodList}" var="item">
    <li>${item} 먹으러 가자 </li>
</c:forEach>
<a href="/main15/sub7"> 첫 페이지로 되돌아가기 </a>

</body>
</html>
