<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>GET, POST 전송</h1>
<form action="/main14/sub6" method="post">
    <div>
        <input type="text" name="username">
        <input type="password" name="password">
    </div>
    <button>전송</button>

</form>

</body>
</html>
