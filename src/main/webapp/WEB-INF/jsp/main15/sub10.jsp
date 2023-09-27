<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>\${modelAttr1} : ${modelAttr1}</h1>
<h1>\${sessionAttr1} : ${sessionAttr1}</h1>

<h1>\${attr1} : ${attr1}</h1>
<%--el 에서 attribute 에 접근하면 좁은영역에서 부터 찾는다--%>
<%--세션은 여러개의 리퀘스트를 동시에 받을수 있어야 하기 때문에
    model < session 이 영역이 더 크다--%>
<h1>\${} : ${sessionScope.attr1}</h1>
</body>
</html>
