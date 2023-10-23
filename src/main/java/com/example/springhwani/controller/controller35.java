package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto38;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.endpoints.internal.Value.Str;

@Controller
@RequestMapping("main35")
@RequiredArgsConstructor
public class controller35 {

   @GetMapping("sub1")
   public void method1() {

   }

   @GetMapping("sub2")
   public void method2() {
      System.out.println("controller35.method2");
   }

   @GetMapping("sub3")
   public void method3(String addreess) {
      System.out.println("addreess = " + addreess);
   }

   @GetMapping("sub4")
   public void method4(String address, String name, Integer age, String email) {
      System.out.println("address = " + address);
      System.out.println("name = " + name);
      System.out.println("age = " + age);
      System.out.println("email = " + email);
   }

   @GetMapping("sub5")
   public void method5(
      String city,
      Integer id,
      Double score,
      String country) {
      System.out.println("ciry = " + city);
      System.out.println("id = " + id);
      System.out.println("score = " + score);
      System.out.println("country = " + country);

   }

   @GetMapping("sub6")
   public void method6(
      Integer id,
      LocalDate birthdate,
      String email,
      String address) {
      System.out.println("id = " + id);
      System.out.println("birthdate = " + birthdate);
      System.out.println("email = " + email);
      System.out.println("address = " + address);
   }

   @GetMapping("sub7")
   public void method7(MyDto38 dto38) {
      System.out.println("dto38 = " + dto38);
   }

   @PostMapping("sub8")
   public void method8() {
      System.out.println("controller35.method8");
   }
   @PostMapping("sub9")
   public void method10(MyDto38 dto38) {
      System.out.println("dto38 = " + dto38);
   }

   @PostMapping("sub10")
   public void method9(String name, @RequestParam("files[]") MultipartFile[] files) {
      System.out.println("files = " + files);
      if (files != null) {
         System.out.println("파일 목록");
         for (MultipartFile file : files) {
            if(file.getSize() > 0)
            System.out.println(file.getOriginalFilename());
         }
      }
   }
}
