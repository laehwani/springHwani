package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao4;
import com.example.springhwani.dao.MyDao5;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main31")
@RequiredArgsConstructor
public class Controller31 {

   private final MyDao5 dao;

   @GetMapping("sub1")
   public void method1() {
      String res = dao.select1("mexico");
      System.out.println("res = " + res);

      String res2 = dao.select1(null);
      System.out.println("res2 = " + res2);

   }

   @GetMapping("sub2")
   public void method2(Integer num) {
      dao.select2(num);
   }
}
