<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>body
    <div>
        <a href="/main17/List">목록 보기</a>
    </div>
</div>
<h1> 글 보기 </h1>
<div>
    <label for="titleInput">제목</label>
    <input type="text" name="title" id="titleInput" readonly value="${post.title}">
</div>
<div>
    <%--textarea[placeholder=본문][name=body]--%>
    <textarea name="body" id="" cols="30" rows="10" readonly>
        ${post.body}
    </textarea>
</div>
</body>
</html>
