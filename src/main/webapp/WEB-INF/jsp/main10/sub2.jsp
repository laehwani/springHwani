<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오후 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${personMap.person1.firstName}</h1>
<h1>${personMap.person2.firstName}</h1>
<hr>
<%--시작할때는 항상 데이터를 [" "] 로 묶어줘야한다 --%>
<%--$, _, 숫자, 영문대소문자 조합만 가능하다--%>
<%--숫자로 시작하면 안된다.--%>
<h1>${people["1st"].className}</h1>
<h1>${people["2nd"].className}</h1>

</body>
</html>
