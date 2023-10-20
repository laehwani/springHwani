<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-20
  Time: 오후 2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>파일 업로드</h3>
<%---- 파일 전송 form 요소 -- 중요!!--%>
<%--일단 method 는 "post"--%>
<%--enctype="multipart/form-data"--%>
<form action="/main33/sub2" method="post" enctype="multipart/form-data">
    <div>이름
        <input type="text" name="name">
    </div>
    <div>나이
        <input type="text" name="age">
    </div>
    <div>파일
        <input type="file" name="myFile">
    </div>
    <div>
        <input type="submit" value="전송">
    </div>
</form>

</body>
</html>
