<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오후 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<li>
<h1>forEach tag</h1>
<p>콘텐츠 반복 출력</p>
<p>주요 attribute : begin, end, var, items, varStatus</p>
<%--begin 과 end 포함해서 반복--%>
<%--end는 begin보다 커야 딘다.--%>
<%--begin 은 0보다 크거나 같아야함--%>
<c:forEach begin="1" end="3">
  <li>Lorem ipsum.</li>

</c:forEach>
<hr>
<a:forEach begin="0" end="2" var="num">
  <li>num : ${num}</li>
</a:forEach>
<hr>
<c:forEach begin="0" end="2" var="num">
</li>car : ${myList[num]} </li>
</c:forEach>
<hr>
<c:forEach items="${myList}" var="item">
  <li>car: ${item}}</li>
</c:forEach>
</body>
</html>
