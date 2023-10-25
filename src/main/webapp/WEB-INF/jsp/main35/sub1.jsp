<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-23
  Time: 오후 2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<div>
<button onclick="ajax1()">button1</button>
<script>
    function ajax1() {
      // https://axios-http.com/kr/docs/req_config 엑시오스 참조주소
      axios.request({
        url: "/main35/sub2"
      });
    }
</script>
</div>
<div>
    <button onclick="ajax2()">버튼2</button>
    <script>
      function ajax2() {
        axios.request({
          url: "/main35/sub3?address=seoul"
        });
      }
    </script>
</div>
<div>
    <button onclick="ajax3()">버튼3</button>
    <script>
      function ajax3() {
        axios.request({
          url: "/main35/sub4",
          params: {
            address: "seoul",
            name: "son",
            age: 33,
            email: "abc@naver.com"
          }
        });
      }
    </script>
</div>
<div>
    <button onclick="ajax4()">버튼4</button>
    <script>
      function ajax4() {
        axios.request({
          url: "/main35/sub5",
          params: {
            city: "seoul",
            id: 30,
            score: 99.99,
            country: "goyang"
          }
        });
      }
    </script>
</div>
<div>
    <div>
        <input type="text" id="input1" value="도시">
    </div>
    <div>
        <input type="text" id="input2" value="번호">
    </div>
    <div>
        <input type="text" id="input3" value="점수">
    </div>
    <div>
        <input type="text" id="input4" value="국가">
    </div>
    <div>
        <button onclick="ajax5()">버튼5</button>
        <script>
          function ajax5() {
            const city = document.querySelector("#input1").value;
            const id = document.querySelector("#input2").value;
            const score = document.querySelector("#input3").value;
            const country = document.querySelector("#input4").value;
            axios.request({
              url: "/main35/sub5",
              params: {
                city: city,
                id: id,
                score: score,
                country: country
              }
            });
          }
        </script>
    </div>
</div>
<div>
    <div>
        <input type="text" id="input6" placeholder="아이디">
    </div>
    <div>
        <input type="date" id="input7" placeholder="생일">
    </div>
    <div>
        <input type="email" id="input8" placeholder="이메일">
    </div>
    <div>
        <input type="text" id="input9" placeholder="주소">
    </div>
    <div>
        <button onclick="ajax6()">버튼6</button>
        <script>
            function ajax6() {
              const id = document.querySelector("#input6").value;
              const birthdate = document.querySelector("#input7").value;
              const email = document.querySelector("#input8").value;
              const address = document.querySelector("#input9").value;
              axios.request({
                url: "/main35/sub6",
                params: {
                  id: id,
                  birthdate: birthdate,
                  email: email,
                  address: address
                }
              });
            }
        </script>
    </div>
</div>
<div>
    <button onclick="ajax7()">버튼7</button>
    <script>
      function ajax7() {
        axios.request({
          url: "/main35/sub7",
          param:{
            id: 9,
            lastName: "래환",
            firstName: "김"
          }
        })
      }
    </script>
</div>
<div>
    <button onclick="ajax8()">버튼8</button>
    <script>
      function ajax8() {
        axios.request({
          url: "/main35/sub8",
          method: "post",
        })
      };
    </script>
</div>
<div>
    <button onclick="ajax9()">버튼9</button>
    <script>
      function ajax9() {
        axios.post("/main35/sub9")
      };
    </script>
</div>
<div>
    <button onclick="ajax10()">버튼10</button>
    <script>
      function ajax10() {
        axios.post("/main35/sub10", {
          city: "서울",
          country: "한국"
        },{
          headers: {
            headers: { 'content-type': 'application/x-www-form-urlencoded' }
          }
      });
      }
    </script>
</div>
<div>
    <div>
        <input type="text" id="input10" placeholder="번호">
    </div>
    <div>
        <input type="text" id="input11" placeholder="이름">
    </div>
    <div>
        <input type="text" id="input12" placeholder="성">
    </div>
    <div>
        <button onclick="ajax11()">버튼11</button>
        <script>
          function ajax11() {
            const id = document.querySelector("#input10").value;
            const lastName = document.querySelector("#input11").value;
            const firstName = document.querySelector("#input12").value;

            axios.post("/main35/sub10", {
              id: id,
              lastName: lastName,
              firstName: firstName
            },{
              headers: {
                headers: { 'content-type': 'application/x-www-form-urlencoded' }
              }
            });
          }
        </script>
    </div>
</div>
<div>
    <div>
        <input type="file" multiple id="input13" accept="image/*">
    </div>
    <button onclick="ajax12()">버튼12</button>
    <script>
      function ajax12() {
        axios.postForm("/main35/sub10", {
          files: document.querySelector("#input13").files

        });
      }
    </script>
</div>
<div>
    <div>
        <button onclick="ajax13()">버튼13</button>
    </div>
    <script>
      function ajax13() {
        axios.get("/main35/sub1")
      }
    </script>
</div>

</body>
</html>
