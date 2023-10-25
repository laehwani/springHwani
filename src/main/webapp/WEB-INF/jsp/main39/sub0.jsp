<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-25
  Time: 오후 12:17
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
    <button onclick="ajax1()">버튼1</button>
    <script>
      function ajax1() {
        axios.get("/main39/sub1")
        .then(() => console.log("성공"))
        .catch(() => console.log("실패"))
      }
    </script>
</div>
<div>
    <button onclick="ajax2()">버튼2</button>
    <script>
      function ajax2() {
        axios.get("/main39/sub2")
        .then(() => console.log("성공"))
        .catch(() => console.log("실패"))
      }
    </script>
</div>
<div>
    <button onclick="ajax3()">버튼3</button>
    <script>
      function ajax3() {
        axios.get("/main39/sub2")
        .catch(error => {
          console.log(error);
          console.log(error.reponse.status)
          let status = error.reponse.status;
          if (status >= 400 && status < 500) {
                      console.log("요청이 잘못 되었습니다.");
                    }else if(error.request){
                      console.log("서버에서 오류 발생")
                    }
        })
      }
    </script>
</div>
<div>
    <button onclick="ajax4()">버튼4</button>
    <script>
      function ajax4() {
        axios.get("/main39/sub3")
        .catch((error) => {
          const status = error.reponse.status;
          let message = "";
          if (400 >= status && status < 500) {
            message = "잘못된 요청";
          }else if (status < 600 && status >= 501) {
            message = "서버 에러";
          }
          document.querySelector("#result1").textContent = message;
        })
      }
    </script>
</div>
<div>
    <input type="text" id="input1" value="30">
    <button onclick="ajax5()">버튼5</button>
    <script>
      function ajax5() {
        const pid = document.getElementById("input1").value;
        axios.get("/main39/sub4?id=" + pid)
        .then(response => response.data)
        .then((data) => console.log(data))
        .catch((error) => console.log(error))
      }
    </script>
</div>
<div>
    <button onclick="ajax6()">버튼6</button>
    <script>
        function ajax6() {
          axios.get("/main39/sub5")
          .then(() => console.log("성공#"))
          .catch(() => console.log("실패$"))
          .finally(() => console.log("항상####"))
        }
    </script>
</div>
<div>
    <h3> 직원 등록 </h3>
    <div>
        <input type="text" id="firstNameInput" placeholder="first name">
    </div>
    <div>
        <input type="text" id="lastNameInput" placeholder="last name">
    </div>
    <div>
        <input type="date" id="birthInput">
    </div>
    <div>
        <textarea id="notesTextArea" cols="30" rows="10" placeholder="notes">


        </textarea>
    </div>
    <div>
        <button onclick="ajax7AddEmployee()" id="button1">등록</button>
    </div>
    <p id="result2"></p>
    <script>
        function ajax7AddEmployee() {
          const button1 = document.getElementById("button1");
          button1.setAttribute("disabled", "disabled");

          const lastName = document.getElementById("lastNameInput").value;
          const firstName = document.getElementById("firstNameInput").value;
          const birthDate = document.getElementById("birthInput").value;
          const notes = document.getElementById("notesTextArea").value;

          axios.post("/main39/sub6", {
            lastName, firstName, birthDate, notes
          })
          .then(() => {
            document.getElementById("result2").textContent = "등록 성공";
            console.log("성공##")
          })
          .catch((error) => {
            const code = error.response.status;
              if (400 <= code && code > 500) {
                document.getElementById("result2").textContent = "잘못된 입력!";
              } else if (500 <= code()) {
                document.getElementById("result2").textContent = "서버 오류임!"
                console.log("실패$$$$")
              }
          })
          .finally(() => {
            button1.removeAttribute("disabled")
          });
        }
    </script>
</div>
</body>
</html>
