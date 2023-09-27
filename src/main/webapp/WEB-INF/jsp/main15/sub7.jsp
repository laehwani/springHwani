<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 좋아하는 음식들😍😍😍 </h1>
<form action="/main15/sub8" method="post">
<%--  div*5>label[for=input$]+input--%>
  <h1> 오늘 뭐먹으러 갈까? </h1>
  <div>
    <label for="input1">chicken</label>
    <input type="checkbox" name="foods" id="input1" value="chicken">
  </div>
  <div>
    <label for="input2">donut</label>
    <input type="checkbox" name="foods" id="input2" value="donut">
  </div>
  <div>
    <label for="input3">kimbab</label>
    <input type="checkbox" name="foods" id="input3" value="kimbab">
  </div>
  <div>
    <label for="input4">kimchi</label>
    <input type="checkbox" name="foods" id="input4" value="kimchi">
  </div>
  <div>
    <label for="input5">burger</label>
    <input type="checkbox" name="foods" id="input5" value="burger">
  </div>
  <input type="submit" value="전송">
</form>

</body>
</html>
