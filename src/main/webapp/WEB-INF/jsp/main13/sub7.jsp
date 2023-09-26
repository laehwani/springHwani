<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main13/sub8">
  <div>
    <label for="input1">아이디를 입력하셈</label>
    <input type="number" id="input1" name="id">
  </div>
  <div>
    <label for="input2">이름을 입력하셈</label>
    <input type="text" id="input2" name="name">
  </div>
  <div>
    <label for="input3">주소를 입력하셈</label>
    <input type="text" id="input3" name="address">
  </div>
  <div>
    <label for="input4">스케쥴 뭐임</label>
    <input type="datetime-local" id="input4" name="schedule">
  </div>
  <p>좋아하는 음식 체크하셈</p>
  <div>
    <label for="input5">피자</label>
    <input type="checkbox" id="input5" name="foods" value="pizza">
  </div>
  <div>
    <label for="input6">김치</label>
    <input type="checkbox" id="input6" name="foods" value="kimchi">
  </div>
  <div>
    <label for="input7">짜장</label>
    <input type="checkbox" id="input7" name="foods" value="jjajang">
  </div>
  <button>확인누르셈</button>
</form>


</body>
</html>
