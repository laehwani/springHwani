package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao8;
import com.example.springhwani.domain.MyDto33Employee;
import com.example.springhwani.domain.MyDto45;
import com.example.springhwani.service.MyService2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("main39")
@RequiredArgsConstructor
public class Controller39 {

   private final MyDao8 dao8;

   private final MyService2 service;
   @GetMapping("sub0")
   public void method0() {
   }

   @GetMapping("sub1")
   public ResponseEntity method1() {
      // ResponseEntity
      // : 응답코드, 응답본문 작성 가능한 객체
      return ResponseEntity.status(200).build();
   }

   @GetMapping("sub2")
   @ResponseBody
   public ResponseEntity method2() {
      // ResponseEntity
      // : 응답코드, 응답본문 작성 가능한 객체
      return ResponseEntity.badRequest().build();
   }

   @GetMapping("sub3")
   public ResponseEntity method3() {
      return ResponseEntity.internalServerError().build();
   }

   @GetMapping("sub4")
   public ResponseEntity<MyDto45> method4(Integer id) {
      MyDto45 data = dao8.selectByProductId(id);

      return ResponseEntity.ok(data);
   }

   @GetMapping("sub5")
   public ResponseEntity method5() {
      if (Math.random() > 0.5) {
         return ResponseEntity.ok().build(); // 2xx
      } else {
         return ResponseEntity.internalServerError().build(); //5xx
      }
   }

   @PostMapping("sub6")
   public ResponseEntity method6(@RequestBody MyDto33Employee dto) {

      if (service.validate(dto)) {
         int rows = service.add(dto);
         if (rows == 1) {
            return ResponseEntity.ok().build();
         } else {
            return ResponseEntity.internalServerError().build();
         }
      } else {
         return ResponseEntity.badRequest().build();
      }
   }
}
