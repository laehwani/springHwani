<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${phones.phone2}</h1>
<h1>${cities.us}</h1>
<h1>${foods["1st"]}</h1>
<hr>
<h1>${cities.korea}</h1>
<h1>${cities[korea]}</h1>
<h1>${cities["o1"]}</h1>
<h1>${cities[o1]}</h1>
<hr>
<h2>${attr1}</h2>
<h2>${attr2}</h2>
<h2>${attr3}</h2>
<h2>${attr3.name}</h2>
<hr>

<h1>${attr3.address}</h1>
<h1>${attr3.email}</h1>
<h1>${attr3.age}</h1>
<%--위에 코드에서 " " 가 없는 o1 은 출력이 안된다.--%>

</body>
</html>
