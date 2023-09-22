<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--key 값으로 value 값 찾기--%>
<%--첫번째 방법--%>
<h1>${myMap}</h1>
<h1>${myMap["son"]}</h1>
<h1>${myMap["lee"]}</h1>
<h1>${myMap["kim"]}</h1>

<%--두번째 방법--%>
<h2>${myMap.son}</h2>
<h2>${myMap.lee}</h2>
<h2>${myMap.kim}</h2>

<hr>
<h3>${cityMap.seoul}</h3>
<h3>${cityMap.busan}</h3>
<h3>${color.red}</h3>
<h3>${color.blue}</h3>
<h3>${color["black"]}</h3>

<h4>${attr3.name}</h4>
<h4>${attr3["name"]}</h4>
<h4>${attr3["my name"]}</h4>
<h4>${attr3["your-name"]}</h4>
<%--한칸 띄어쓰기나 - 는 다른 의미부여가 있기에 " " 단순 텍스트 출력이면 괄호로 묶어주자--%>


</body>
</html>
