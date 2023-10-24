package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao6;
import com.example.springhwani.dao.MyDao7;
import com.example.springhwani.domain.MyDto37;
import com.example.springhwani.domain.MyDto38;
import com.example.springhwani.domain.MyDto39;
import com.example.springhwani.domain.MyDto40;
import java.time.LocalDate;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("main36")
@RequiredArgsConstructor
public class controller36 {

   private final MyDao7 dao7;

   @GetMapping("sub1")

   public void method1() {

   }

   // axios.get("/main36/sub2",{params: {id: 5}})
   // = /main36/sub2?id=5
//   @GetMapping("sub2")
//   public void method1(Integer id) {
//      Map<String, Object> data =
//         dao7.selectByCustomerId(id);
//      System.out.println("data = " + data);
//   }

   // axios.get("/main36/sub3", {params: {id:10}})
   @GetMapping("sub3")
   public void method3(Integer id) {
      Map<String, Object> data = dao7.selectByProductId(id);
      System.out.println("data = " + data);
   }

   // lastName=손&firstName=흥민&birthDate=2020-02-02
   /* axios.post("/main36/sub4", {
         lastName: "손",
         firstName: "흥민",
         brithDate: "2020-02-02"
         },{
            headers: {
               "content-type": "application/x-www-form-urlencoded"
               }
         })
     */
   @PostMapping("sub4")
   public void method4(String lastName,
      String firstName,
      LocalDate brithDate) {
      dao7.insertEmployeeId(lastName, firstName, brithDate);
   }

   /*
   axios.post("/main36/sub5", {
         name: "초콜릿",
         price: 35.55,
         category: 83
   },{
      headers: {
         "content-type": "application/x-www-form-urlencoded"
         }
      })
    */
   @PostMapping("sub5")
   public void method5(String name,
      Double price,
      Integer category) {
      int i = dao7.insertProduct(name, price, category);
      System.out.println(i + "개 행이 입력되었습니다.");
   }


   //   @RequestMapping(method = RequestMethod.DELETE, value = "sub6")
   @DeleteMapping("sub6")
   public void method6() {
      System.out.println("controller36.method6");
   }

   /*
   axios.delete("/main36/sub6")
    */
//   axios.delete("/main36/sub7")
   @DeleteMapping("sub7")
   private void method7() {
      System.out.println("controller36.method7");
   }

   /*
   axios.delete("/main36/sub8?name=son")
    */
   @DeleteMapping("sub8")
   public void method8(String name) {
      System.out.println("name = " + name);
   }

   // PathVariable : 경로에 포함된 데이터
   @DeleteMapping("sub9/{name}")
   public void method9(@PathVariable("name") String n) {
      System.out.println("n = " + n);
   }
   /*
   axios.delete("/main36/sub9/son")
   axios.delete("/main36/sub9/lee")
    */

   /*
   axios.delete("/main36/sub10/3")
   axios.delete("/main36/sub10/5")
   axios.delete("/main36/sub10/7")
    */
   @DeleteMapping("sub10/{id}")
   public void method10(@PathVariable Integer id) {
      System.out.println("id = " + id);
   }

   /*
   axios.delete("/main36/sub11/3")
   axios.delete("/main36/sub11/5")
   axios.delete("/main36/sub11/7")
    */
   @DeleteMapping("sub11/{pid}")
   public void method11(@PathVariable Integer pid) {
      int i = dao7.deleteByProductId(pid);
      System.out.println(i + "개 행이 삭제됨");
   }

   /* 예제풀기
   axios.delete("/main36/sub12/1")
   axios.delete("/main36/sub12/3")
   axios.delete("/main36/sub12/5")
    */
   @DeleteMapping("sub12/{pid}")
   public void method12(@PathVariable Integer pid) {
      int i = dao7.deleteByCustomerId(pid);
      System.out.println(i + "개 행이 삭제됨");
   }

   /*
   axios.put("/main36/sub13")
    */
// @RequestMapping(method = RequestMethod.Put, value = "sub13")

   @PutMapping("sub13")
   public void method13() {
      System.out.println("controller36.method13");
   }

   /*
   axios.put("/main36/sub14", {
      name: "son",
      address: "seoul"
      }, {
         headers: {
              "content-type": "application/x-www-form-urlencoded"
              } 
      })
    */
   @PutMapping("sub14")
   public void method14(String name, String address) {
      System.out.println("name = " + name);
      System.out.println("address = " + address);
   }

   /*
   axios.put("/main36/sub15", {
      city: "seoul",
      age: 78,
      score: 3.14
      }, {
         headers: {
         "content-type": "application/x-www-form-urlencoded"
         }
   });
    */
   @PutMapping("sub15")
   public void method15(MyDto39 dto) {
      System.out.println("city = " + dto.getCity());
      System.out.println("age = " + dto.getAge());
      System.out.println("score = " + dto.getScore());
   }

   /*
   axios.put("/main36/sub16", {
      id:3,
      name: "햄버거",
      category: 2,
      price: 5000.00
      }, {
         headers: {
         "content-type": "application/x-www-form-urlencoded"
         }
         });
    */
   /*
      axios.put("/main36/sub17", {
         id: 5,
         lastName: "lee",
         firstName: "Kangin",
         birthDate: "2020-02-02"
   }, {
      headers: {
       "content-type": "application/x-www-form-urlencoded"
      }
   });
    */
   @PutMapping("sub17")
   public void method17(MyDto40 dto40) {
      int i = dao7.updateEmployeeId(dto40);
      System.out.println(i + "개 행이 추가됨");

   }
}
