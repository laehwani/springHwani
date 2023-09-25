<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> form 요소 </h1>
<form>
<%--select(option), textarea--%>
    <input type="text" name="param1">
    <br>
    <input type="text" name="param2">
    <br>
    <button>전송</button>
</form>
<hr>

<%--    전송버튼 클릭시 --%>
<%--    ?name=lee&age=44&address=seoul&email=주소--%>
<form>
    <button >전송</button>
    <br>
    <input type="text" name="name">
<%--    <br>--%>
    <input type="text" name="age">
<%--    <br>--%>
    <input type="text" name="address">
<%--    <br>--%>
    <input type="text" name="email">
    <br>
</form>
<h3>action 속성 : request 파라마터들을 어디로 보낼지 결정한다.</h3>
<form action="https://search.naver.com/search.naver">
    <input type="text" name="query">
    <br>
    <button>전송</button>
</form>
<form action="https://www.google.co.kr/search">
    <input type="text" name="q">
    <br>
    <button>전송</button>
</form>
<form action="https://search.daum.net/search">
    <input type="text" name="q">
    <br>
    <button>전송</button>
</form>
<h1> action 속성값 : /로 시작하는 경우 절대경로 path 로 결정됨 </h1>
<form action="/main99/sub2">
    <input type="text" name="email">
    <button>전송</button>
</form>
<%--전송버튼 클릭시 request parameter 가 /main12/sub2 로 전송되도록 해보기--%>
<form action="/main12/sub2">
    <input type="text" name="age">
    <button>전송</button>
</form>
<hr>
<h1> action 속성 값 : /도 아니고 protocol 이 아니면 현재페이지의 상대경로 </h1>
<h1> path에서 마지막 / 기준 </h1>
<form action="main12/sub2">
    <input type="text" name="email">
    <button>전송</button>
</form>
<%--.. : 한경로 위--%>
<form action="..sub3">
    <input type="text" name="email">
    <button>전송</button>
</form>

</body>
</html>
