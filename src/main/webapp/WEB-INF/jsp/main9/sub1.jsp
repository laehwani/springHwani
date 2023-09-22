<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오전 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${attr1}</h1>
<h2>${attr2}</h2>
<h3>${attr3}</h3>

<%--배열은 [] 와 인덱스 조합으로 출력한다--%>
<h4>${attr4}</h4>
<h4>${attr4[0]}</h4>
<h4>${attr4[1]}</h4>

<h1>${yourArr6[0]}</h1>
<h1>${yourArr6[1]}</h1>
<h1>${yourArr6[2]}</h1>

</body>
</html>
