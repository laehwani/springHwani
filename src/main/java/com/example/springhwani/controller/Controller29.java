package com.example.springhwani.controller;

import com.example.springhwani.MyDao3.MyDao3;
import com.example.springhwani.domain.MyDto19;
import com.example.springhwani.domain.MyDto20;
import com.example.springhwani.domain.MyDto21;
import com.example.springhwani.domain.MyDto22;
import com.example.springhwani.domain.MyDto23;
import com.example.springhwani.domain.MyDto24;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main29")
@RequiredArgsConstructor
public class Controller29 {

   private final MyDao3 myDao3;

   @GetMapping("sub1")
   public void method1() {
      String name = myDao3.select1();
      System.out.println("name = " + name);
   }

   @GetMapping("sub2")
   public void method2() {
      Double price = myDao3.select2();
      System.out.println("price = " + price);
   }

   @GetMapping("sub3")
   public void method3() {
      // 1번 직원의 LastName 조회 후 출력
      String name = myDao3.select3();
      System.out.println("name = " + name);
   }

   @GetMapping("sub4")
   public void method4() {
      // 2번 직원의 생일 조회 후 출력
      String date = myDao3.select4();
      System.out.println("date = " + date);
   }

   @GetMapping("sub5")
   public void method5() {
      List<String> countrys = myDao3.select5();
      countrys.forEach(System.out::println);

   }

   @GetMapping("sub6")
   public void method6() {
      // 직원들의 생일 조회
      List<LocalDate> birthdate = myDao3.select6();
      birthdate.forEach(System.out::println);
   }

   @GetMapping("sub7")
   public void method7() {
      // 상품의 가격들 조회
      List<Double> priceList = myDao3.select7();
      priceList.forEach(System.out::println);
      // 가격의 총 개수(size) 를 원한다면?
      System.out.println("price = " + priceList.size());
   }

   @GetMapping("sub8")
   public void method8() {
      Map<String, Object> row = myDao3.select8();
      System.out.println("row = " + row);
   }

   @GetMapping("sub9")
   public void method9() {
      // 1번 상품의 상품명, 가격, 카테고리명
      Map<String, Object> name = myDao3.select9();
      System.out.println("name = " + name);

   }

   @GetMapping("sub10")
   public void method10() {
      MyDto19 dto = myDao3.select10();
      System.out.println("dto = " + dto);
   }

   @GetMapping("sub11")
   public void method11() {
      MyDto20 dto = myDao3.select11();
      System.out.println("dto = " + dto);
   }

   @GetMapping("sub12")
   public void method12() {
      MyDto21 dto = myDao3.select12();
      System.out.println("dto = " + dto);
      // 2번 고객의 id, name, country
      // mydto21 의 프로퍼티는 id , name, country
   }

   @GetMapping("sub13")
   public void method13() {
      List<Map<String, Object>> rows = myDao3.select13();
      for (Map<String, Object> row : rows) {
         System.out.println("row = " + row);
      }
   }

   @GetMapping("sub14")
   public void method14() {
      // 1996-07-04 일에 주문된 상품명, 상품수량, 가격
      List<Map<String, Object>> rows = myDao3.select14();
      for (Map<String, Object> row : rows) {
         System.out.println("row = " + row);
//      rows.forEach(System.out::println);
      }
   }

   @GetMapping("sub15")
   public void method15() {
      List<MyDto22> list = myDao3.select15();
//      for (Map<String, Object> lists : list) {
//         System.out.println("목록 = " + lists);
//      }
      list.forEach(System.out::println);
   }

   @GetMapping("sub16")
   public void method16() {
      // 1번 카테고리 상품들이 주문된 날짜, 상품명, 카테고리명
      List<MyDto23> list = myDao3.select16();
//      list.forEach(System.out::println);
      for (MyDto23 lists : list) {
         System.out.println("목록 = " + lists);
      }
      System.out.println("list.size() = " + list.size());
   }

   @GetMapping("sub17")
   public void method17() {
      String s = myDao3.select17();
      System.out.println("s = " + s);
   }

   @GetMapping("sub18")
   public void method18() {
      // 기본형(primitive) 타입은 null 값을 못 읽기에 항상 참조타입쓰는것이 좋다.
      Integer s = myDao3.select18();
      System.out.println("s = " + s);
   }

   @GetMapping("sub19")
   public void method19() {
      MyDto24 dto = myDao3.select19();
      System.out.println("dto = " + dto);
   }

   @GetMapping("sub20")
   public void method20() {
      MyDto24 myDto24 = myDao3.select20();
   }
}
