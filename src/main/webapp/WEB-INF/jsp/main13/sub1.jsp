<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오전 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> input 요소들 </h3>
<form action="/main13/sub1">
<%--    div*10>input[name]^button{전송}--%>
    <div>
        <input type="text" name="param1">
    </div>
    <div>
        <input type="password" name="param2">
    </div>
    <div>
        <input type="date" name="param3">
    </div>
    <div>
        <input type="button" name="param4" value="click😎😎😎">
    </div>
    <div>
        <input type="number" name="param5">
<%--        숫자만 입력가능한 input기능. 하지만 스프링자동형변환에 의해 String 타입으로 표현.--%>
    </div>
    <div>
        <input type="submit" name="param6" value="회원가입">
<%--        누르면 제출하는 역활의 submit , button 과는 다른 역활 --%>
    </div>
    <div>
        <input type="radio" name="param7">
        <input type="radio" name="param7">
<%--        여러개 선택지중에 하나 고르기--%>
    </div>
    <div>
        <input type="radio" name="param7">
        <%--        여러개 선택지중에 하나 고르기--%>
    </div>
    <div>
        <input type="checkbox" name="param8">
        <input type="checkbox" name="param8">
<%--        선택지중에 중복택 가능 고르기--%>
    </div>
    <div>
        <input type="checkbox" name="param8">
<%--        선택지중에 중복택 가능 고르기--%>
    </div>
    <div>
        <input type="hidden" name="param10" value="some value">
<%--        유저에게는 안보이는 데이터 전송을 원할 때 hidden--%>
    </div>
    <button>전송</button>
</form>

<form action="/main13/sub1">
    <div>
        <input type="text" name="param1" value="son">
    </div>
    <div>
        <input type="text" name="param2" placeholder="이름을 입력해주세요">
    </div>
    <div>
        <input type="text" maxlength="5">
    </div>
    <div>
        <input type="text" required>
    </div>
    <div>
        <input type="text" name="param3"readonly value="son">
    </div>
    <div>
        <input type="text" name="param4" value="son" disabled>
    </div>
    <div>
        <input type="text" pattern="\d{3}" name="param5">
<%--        정규 표현식--%>
    </div>
    <div>
        <input type="checkbox" name="param6" checked id="">
<%--        체크 된 상태로 출력되길 원할때 checked--%>
    </div>
    <div>
        <input type="checkbox" name="param6" id="">
    </div>
    <div>
        <input type="file" multiple>
<%--        파일 중복선택 --%>
    </div>
</form>
<hr>
<form action="/main13/sub2">
    <label for="input1">주소</label>
    <input id="input1" type="text">
    <br>
<%--    div>div*3>label[for=check$]>lorem1^input:c#check$--%>
    <div>
        <div>
            <label for="check1">Lorem.</label>
            <input type="checkbox" name="" id="check1">
        </div>
        <div>
            <label for="check2">Aliquam.</label>
            <input type="checkbox" name="" id="check2">
        </div>
        <div>
            <label for="check3">Labore!</label>
            <input type="checkbox" name="" id="check3">
        </div>
    </div>
    <input type="submit" value="전송">
    <button>전송</button>
</form>

</body>
</html>
