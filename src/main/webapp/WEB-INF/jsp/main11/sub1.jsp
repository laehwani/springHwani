<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> implicit el objects </h1>
<%--jsp 가 정의해놓은 객체를 찾는다.--%>
<p>${param}</p>
<p>${header}</p>
<p>${pageScope}</p>
<hr>
<h1> param el 객체 </h1>
<p> request parameter</p>
<%--예) name=son&age=33--%>
<%--("name", "son")--%>
<%--("age", "33--%>
<%--두 entry 를 param 맵에 넣어둠--%>
<p>\${param.name} : ${param.name}</p>
<p>\${param.age} : ${param.age}</p>
<p>\${param.email} : ${param.email}</p>
</body>
</html>
