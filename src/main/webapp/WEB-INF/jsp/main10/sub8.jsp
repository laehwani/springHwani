<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>el 비교연산자</h3>
<p> <, >, <=, >=, ==, != </p>
<p> lt, gt, le, ge, eq, ne </p>

<h4> << </h4>
<p>${a} < ${b} = ${a < b}</p>
<p>${a} lt ${b} = ${a lt b}</p>
<p>${a} > ${b} = ${a > b}</p>
<p>${a} gt ${b} = ${a gt b}</p>
<h4> <= </h4>
<p>${a} <= ${b} = ${a <= b}</p>
<p>${a} le ${b} = ${a le b}</p>
<h4> >= </h4>
<p>${a} >= ${b} = ${a >= b}</p>
<p>${a} ge ${b} = ${a ge b}</p>
<h4> == </h4>
<p>${a} == ${b} = ${a == b}</p>
<p>${a} eq ${b} = ${a eq b}</p>
<h4> != </h4>
<p>${a} != ${b} = ${a != b}</p>
<p>${a} ne ${b} = ${a ne b}</p>
<hr>
<p>${c lt d}</p>
<p>${c gt d}</p>
<p>${c le d}</p>
<p>${c ge d}</p>
<p>${c eq d}</p>
<p>${c ne d}</p>
<hr>
<p>${e > f}</p>
<p>${e + f}</p>
<%--e 와 f 는 string 끼리의 비교이기에 false 가 뜬다.--%>
<hr>
<h3> el 논리연산자 </h3>
<h4> $$ (and), || (or) </h4>
<h4> $$(and) </h4>
<p>${true && true}</p>
<p>${false && false}</p>
<p>${true and true}</p>
<p>${false and false}</p>
<hr>
<h3>만약 저 문장자체로 출력되기를 원한다면 달라앞에 역슬\ 을 붙여주면 된다.</h3>
<p>\${true && true}</p>
<p>\${false && false}</p>
<p>\${e > f}</p>
<p>\${e + f}</p>
<p>\${a} != \${b} = \${a != b}</p>
<p>\${a} ne \${b} = \${a ne b}</p>
<h4> || (or) </h4>
<p>${true || true} : ${ true||true }</p>
<p>${true || false} : ${false || false}</p>
<p>${false || true} : ${false || true}</p>
<p>${true or true} : ${ true or true }</p>
<p>${true or false} : ${false or false}</p>
<p>${false or true} : ${false or true}</p>
<h4> ! (not) </h4>
<p>\${!true} : ${!true}</p>
<p>\${!false} : ${!false} </p>
<p>\${not true} : ${not true}</p>
<p>\${not false} : ${not false}</p>
</body>
</html>
