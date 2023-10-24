package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao7;
import com.example.springhwani.domain.MyDto40;
import com.example.springhwani.domain.MyDto42;
import com.example.springhwani.domain.MyDto43;
import com.example.springhwani.domain.MyDto44;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main37")
@RequiredArgsConstructor
public class Controller37 {

   private final MyDao7 dao7;
   /*
   axios.post("/main37/sub1", '{"name":"jones"}',{
      headers: {
      "content-type": "application/json"
      }
   })
   위에 코드를 줄여서
   axios.post("main37/sub1", {name: "jones"})
    */
   @PostMapping("sub1")
   public void method1(@RequestBody Map<String, Object> map) {
      System.out.println("map = " + map);
   }

   /*
   axios.post("/main37/sub2", {name:"lee", age:33, score:8.9})
   위에 코드를
   js object =
   {name: "lee", age:33, score: 8.9}
   json 형식
   {"name": "lee", "age":33, "score": 8.9}
   java map =
   {name= "lee", age= 33, score= 8.9}
   자바에서 json 형식으로 응답받은후 파싱해서 출력.
    */
   @PostMapping("sub2")
   public void method2(@RequestBody Map<String, Object> map) {

      System.out.println("map = " + map);
   }

   /*
   axios.put("/main37/sub3", {
      city: "seoul",
      name: "son",
      age: 33
      })
    */
   @PutMapping("sub3")
   public void method3(@RequestBody Map<String, Object> map) {

      System.out.println("map = " + map);
   }

   /*
   axios.post("/main37/sub4", {
         city: "paris",
         age:30,
         married: true,
         car: null,
         home: {
            address: "seoul",
            price: 1000
            },
         foods: [
            "pizza",
            "burger",
            "부침개"
            ]
      })
    */
   @PostMapping("sub4")
   public void method4(@RequestBody MyDto42 dto42) {
      System.out.println("dto42 = " + dto42);
   }

   /*
   axios.put("main37/sub5", {
      country: "미쿸",
      score: 99.99,
      skills: [
         "버니",
         "바니",
         "부기부기"],
      phones: "010-111-1111"
    })

    */
   @PostMapping("sub5")
   public void method5(@RequestBody MyDto43 dto43) {
      System.out.println(" 나라 " + dto43.getCountry());
      System.out.println("dto43.getScore() = " + dto43.getScore());
      System.out.println("dto43.getSkills() = " + dto43.getSkills());
      System.out.println("dto43.getPhones() = " + dto43.getPhones());
   }

   /*
   axios.post("/main37/sub6",{
      name: "son",
      email: ["son@gmail.com", "hm@gmail.com"],
      home: {
         first: "seoul",
         second: "london"
         },
      price: 35.11,
      weight: 77.6
   })
    */
   @PostMapping("sub6")
   public void method6(@RequestBody MyDto44 dto44) {
      System.out.println("dto44.getName() = " + dto44.getName());
      System.out.println("dto44.getEmail() = " + dto44.getEmail());
      System.out.println("dto44.getHome( = " + dto44.getHome());
      System.out.println("dto44.getPrice() = " + dto44.getPrice());
      System.out.println("dto44.getWeight() = " + dto44.getWeight());
      System.out.println("dto44.getMarried() = " + dto44.getMarried());

   }

   /*
      axios.put("/main37/sub7", {
      id = 3,
      lastName: "seoul",
      firstName: "son",
      birthDate: "2020-02-02"
      })
    */
   @PutMapping("sub7")
   public void method7(@RequestBody MyDto40 dto40) {
      int i = dao7.updateEmployee(dto40);
      System.out.println(i + "개 행이 수정되었음.");
   }

}
