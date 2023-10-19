<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-19
  Time: 오전 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> 고객 조회 </h3>
<form action="/main30/sub15">
    <input type="text" name="id" placeholder="고객번호">
    <button>조회</button>
</form>
<hr>
<div>
    <h4>${message}</h4>
</div>
<h3> 고객 수정 </h3>
<form action="/main30/sub16" method="post">
    <div>
        <input type="text" name="id" value="${customer.id}" readonly placeholder="고객번호">
        <span>-고객번호</span></div>
    <div>
        <input type="text" name="name" value="${customer.name}" placeholder="고객명">
        <span>-고객명</span></div>
    <div>
        <input type="text" name="address" value="${customer.address}" placeholder="주소">
        <span>-주소</span></div>
    <div>
        <input type="text" name="country" value="${customer.country}" placeholder="국가">
        <span>-국가</span></div>
    <div>
        <button>수정</button>
    </div>
</form>
</body>
</html>
