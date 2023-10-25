package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao8;
import com.example.springhwani.domain.MyDto33Employee;
import com.example.springhwani.domain.MyDto45;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.eclipse.tags.shaded.org.apache.xpath.operations.String;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("main38")
@RequiredArgsConstructor
public class Controller38 {

   private final MyDao8 dao8;

   @GetMapping("sub0")
   public void method0() {

   }
   /*
   axios.get("/main38/sub1")
    */

   @GetMapping("sub1")
   @ResponseBody
   public java.lang.String method1() {
      return "/main38/sub1";
   }

   @GetMapping("sub2")
   @ResponseBody
   public java.lang.String method2() {
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      return "hello world";
   }

   /*
   axios.get("/main38/sub3")
    */
   @GetMapping("sub3")
   @ResponseBody
   public Map<java.lang.String, Serializable> method3() {
      return Map.of("name", "son", "age", 33);
   }

   @GetMapping("sub4")
   @ResponseBody
   public Map<java.lang.String, Object> method4() {
      return Map.of("city", "seoul",
         "price", 3000,
         "list", List.of("son", "lee","kim"),
         "birth","1999-03-03");
   }

   /*
   axios.get("/main38/sub5?id=8")
    */
   @GetMapping("sub5")
   @ResponseBody
   public Map<String, Object> method5(Integer id) {
      return dao8.selectProductId(id);
   }

   @GetMapping("sub6")
   @ResponseBody
   public MyDto33Employee method6(Integer id) {
      return dao8.selectByEmployeeId(id);
   }

   /*
   axios.get("/main38/sub7?id=33")
   33번 상품의 정보를 json 으로 응답
   id, price, 카테고리명, unit(단위)
   7번째 메소드와 45번 dto 이용
    */
   @GetMapping("sub7")
   @ResponseBody
   public MyDto45 method7(Integer id) {
      return dao8.selectByProductId(id);
   }
}
