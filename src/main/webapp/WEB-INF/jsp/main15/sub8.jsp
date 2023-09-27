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
<h1>어떤 게 좋아?</h1>
<ul>
    <c:forEach items="${foodList}" var="item">
        <li>${item}</li>
    </c:forEach>
<%--    배열을 표현할 때는 <c:forEach 를 써야 출력됨.--%>

</ul>
<a href="/main15/sub9"> 다음 페이지로 가기 </a>


</body>
</html>
