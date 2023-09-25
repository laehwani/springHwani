<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="jakarta.tags.core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>el에서 사용할 수 있는 연산자</h3>
<h4>산술 연산자</h4>
<h4>+, -, *, /, %</h4>
<hr>
<h5>+ : 더하기</h5>
<p>${a}+${b} = ${a+b}</p>
<p>${c}+${d} = ${c+d}</p>
<h5>* : 곱하기</h5>
<p>${a}*${b} = ${a*b}</p>
<p>${c}*${d} = ${c*d}</p>
<h5>/ : 나누기</h5>
<p>${a}/${b} = ${a/b}</p>
<p>${c}/${d} = ${c/d}</p>
<p>${a}*${b} = ${a div b}</p>
<p>${c}*${d} = ${c div d}</p>
<%--div 는 나누기로 표현이 된다. --%>

<h1>% : 나머지 연산(modulo, remainder) </h1>
<p>${b} % ${a} = ${b % a}</p>
<p>${c} % ${d} = ${c % d}</p>
<p>${b} % ${a} = ${b mod a}</p>
<p>${c} % ${d} = ${c mod d}</p>
<%--mod 는 나머지값으로 표현이 된다--%>
<hr>
<c:forEach begin="1" end="9" var="i">
    <p>2 X ${i}= ${2 * i}</p>
</c:forEach>
<hr>
<c:forEach begin="2" end="9" var="i" >
    <c:forEach begin="1" end="9" var="j">
        <h1>
            ${i} X ${j} = ${i * j}
        </h1>
    </c:forEach>
</c:forEach>
<h5>구구단 9단 ~ 2단</h5>
<c:forEach begin="0" end="8" var="i" >
    <h1>구구단 ${9 - i}단</h1>
    <c:forEach begin="1" end="9" var="j">
        <h1>
                ${9 - i} X ${j} = ${(9 - i) * j}
        </h1>
    </c:forEach>
</c:forEach>

</body>
</html>
