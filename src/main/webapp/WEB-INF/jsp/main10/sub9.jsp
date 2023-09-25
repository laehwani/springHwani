<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> empty </h2>
<p> empty 는 값이 null, 빈 문자열, 사이즈가 0인 컬렉션이면? true 를 반환 </p>
<p>\${empty a} : ${empty a}</p>
<p>\${empty b} : ${empty b}</p>
<p>\${empty c} : ${empty c}</p>
<p>\${empty d} : ${empty d}</p>
<p>\${empty e} : ${empty e}</p>
<p>\${empty f} : ${empty f}</p>
<p>\${empty g} : ${empty g}</p>
<p>\${empty h} : ${empty h}</p> <%--empty 는 값이 아예 없어도 true 를 반환한다.--%>
<hr>
<h2> not empty (!empty) </h2>
<p> null 이 아닌 속성, 길이가 1이상인 컬렉션 or 문자열을 true 로 반환</p>
<p>\${empty a} : ${!empty a}</p>
<p>\${empty b} : ${!empty b}</p>
<p>\${empty c} : ${!empty c}</p>
<p>\${empty d} : ${!empty d}</p>
<p>\${empty e} : ${!empty e}</p>
<p>\${empty f} : ${!empty f}</p>
<p>\${empty g} : ${!empty g}</p>
<p>\${empty h} : ${!empty h}</p>
</body>
</html>
