<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
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
<h1> 새 글 작성 </h1>
<form method="post">
<%--    div*2>label[for=titleInpit]+input#titleInput[name=title]--%>
    <div>
        <%--@declare id="titleinput"--%><label for="titleInput">제목</label>
        <input type="text" id="title" name="titleInput">
    </div>
    <div>
<%--        textarea[placeholder=본문][name=body]--%>
    <textarea name="body" id="" cols="30" rows="10" placeholder="본문">

    </textarea>
    </div>
    <div>
        <button>전송</button>
    </div>
</form>
</body>
</html>
