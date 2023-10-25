<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-24
  Time: 오후 4:11
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
        function ajax1(){
          axios.get("/main38/sub1");
        }
    </script>
</div>
<div>
    <button onclick="ajax2()">버튼2</button>
    <script>
      function ajax2(){
        axios.get("/main38/sub2")
        .then(function (response) {
          console.log("응답 받은 후 해야하는 일");
          console.log(response.data);
          console.log(response.status);
          console.log(response.statusText);
          console.log(response.headers);
          console.log(response.config);
        });
      }
    </script>
</div>
<div>
    <button onclick="ajax3()">버튼3</button>
    <script>
      function ajax3() {
        axios.get("/main38/sub3")
        .then(function (res) {
          console.log(res.data);
          console.log(res.data.age);
          console.log(res.data.name);
        });
      }
    </script>
</div>
<div>
    <button onclick="ajax4()">버튼4</button>
    <script>
      function ajax4() {
        axios.get("/main38/sub4")
        .then(function (res) {
          const data = res.data
          console.log(data.city);
          console.log(data.price);
          console.log(data.list[0]);
          console.log(data.birth);
        });
      }
    </script>
</div>
<div>
    <input type="text" id="input1" value="5">
    <button onclick="ajax5()">버튼5</button>
    <script>
      function ajax5() {
        const pid = document.querySelector("#input1").value;
        axios.get("/main38/sub5?id=" + pid)
        .then(function (response) {
          const product = response.data;
          console.log(product.ProductID);
          console.log(product.ProductName);
          console.log(product.Unit);
          console.log(product.Price);
        });
      }
    </script>
</div>
<div>
    <button onclick="ajax6()">버튼6</button>
    <script>
      function ajax6() {
        axios.get("/main38/sub2")
        .then(function () {
          console.log("응답 완료 후 실행");
        })
        .then(function () {
          console.log("완료 후 실행");
        })
        .then(function () {
          console.log("그 다음 완료 후 실행");
        });
      }
    </script>
</div>
<div>
    <button onclick="ajax7()">버튼7</button>
    <script>
      function ajax7() {
        axios.get("/main38/sub2")
        .then(function () {
          console.log('첫 함수')
          return "abcd";
        })
        .then(function (param) {
          console.log('두번째 함수')
          console.log(param)
          return 345;

        })
        .then(function (param) {
          console.log('세번째 함수')
          console.log(param)

        });
      }
    </script>
</div>
<div>
    <button onclick="ajax8()">버튼8</button>
    <script>
      function ajax8() {
        axios.get("/main38/sub2")
        .then(function (param) {
          console.log("응답 완료 후 실행");
          return param.data;
        })
        .then(function (param) {
          console.log("두번째 함수")
          console.log(param)
        });
      }
    </script>
</div>

<%--화살표 함수를 알아보자--%>
<div>
    <button onclick="ajax9();">버튼9</button>
    <script>

      function ajax9() {
        axios.get("/main38/sub2")
      .then(param => param.data)
      .then(data => console.log(data))
      }

    </script>
</div>
<div>
    <button onclick="ajax10()">버튼10</button>
    <script>
      function ajax10() {
        axios.get("/main38/sub4")
        /*
        .then(function (response) {
          return response.data;
        })
        .then(function (response) {
          console.log(data.list[1]); // "lee
        })
         */
        .then(response => response.data)
        .then(data => console.log(data.list[1]))
      }
    </script>
</div>
<script>
    // 구조분해할당
    // Destructurin assignment
    let a = {
      name: "son",
      age: 30
    };
    console.log(a.name)
    console.log(a.age)

    let myName = a.name;
    let myAge = a.age;

    console.log(myName);
    console.log(myAge);
    // 위 내용을 구조분해하면 아래와 같다.
    let {name, age} = a;
    console.log(name);
    console.log(age);

    // 예제
    let b = {
      city: "busan",
      country: "korea"
    };
    let {city, country} = b;
    console.log(city);
    console.log(country);

    let c = {
      email: "abc@gmail.com",
      price: 300
    };
    let {email} = c;


    let d = {
      name2: "lee",
      address: "paris",
      age2: 77
    };
    let {name2, age2} = d;

    let e = {
      city: "seoul",
      country: "korea"
    };
    let {city2, country2, category} = e;
    console.log(city2);      // seoul
    console.log(country2);   // korea
    console.log(category);  // undefined

    let f = {
      name3: "kim",
      age3: 44
    };
    let {name3, age3, address3 = "신촌"} = f;
    // address3 같은 없는 값엔 기본값을 할당시켜줄 수 있다.
    console.log(name3);
    console.log(age3);
    console.log(address3);

    let g = [30, 40, 50];
    let [h, i, j] = g;
    console.log(i);
    console.log(j);
    console.log(h);
    let [k,l] = g;
    console.log(k);
    console.log(l);
    let [m, ...n] = g;
    console.log(m);
    console.log(n);
    let [...o] = g;
    console.log(o); // [30,40,50]

</script>
<div>
    <button onclick="ajax11()">버튼11</button>
    <script>

      function ajax11() {
        axios.get("/main38/sub4")
        .then(response => response.data)
        .then(({price, birth, list, city}) => console.log(price));
      }
    </script>
</div>
<div>
    <button onclick="ajax12()">버튼12</button>
    <script>

      function ajax12() {
        axios.get("/main38/sub4")
        .then(({data}) =>
        console.log(data.price));
      }

    </script>
</div>
<div>
    <button onclick="ajax13()">버튼13</button>
    <script>

      function ajax13() {
        axios.get("/main38/sub4")
        .then(({data}) => {
          console.log(data.price);
          console.log(data.city);
          console.log(country="이대");
        })
      }
    </script>
</div>

</body>
</html>
