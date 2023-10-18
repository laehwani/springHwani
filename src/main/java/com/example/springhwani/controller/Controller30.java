package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao4;
import com.example.springhwani.domain.MyDto24;
import com.example.springhwani.domain.MyDto25;
import com.example.springhwani.domain.MyDto26;
import com.example.springhwani.domain.MyDto27;
import com.example.springhwani.domain.MyDto28;
import com.example.springhwani.domain.MyDto29;
import com.example.springhwani.domain.MyDto30;
import com.example.springhwani.domain.MyDto31;
import com.example.springhwani.domain.MyDto32;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main30")
@RequiredArgsConstructor
public class Controller30 {

   private final MyDao4 dao4;

   @GetMapping("sub1")
   public void method1(Integer id) {
      String name = dao4.select1(id);
      System.out.println("name = " + name);
   }

   @GetMapping("sub2")
   public void method2(Double from, Double to) {
      List<String> list = dao4.select2(from, to);
      list.forEach(System.out::println);
   }

   @GetMapping("sub3")
   public void method3(LocalDate from, LocalDate to) {
      List<Map<String, Object>> list = dao4.select3(from, to);
      list.forEach(System.out::println);

      // frotm ~ to 에 주문된 상품명 출력(정렬해서, 중복X)
   }

   @GetMapping("sub4")
   public void method4() {
      MyDto25 dto = new MyDto25();
      dto.setMin(50.00);
      dto.setMax(80.00);

      List<String> list = dao4.select4(dto);
      System.out.println("list = " + list);
      System.out.println("list.size() = " + list.size());
   }

   @GetMapping("sub5")
   public void method5(MyDto26 dto) {
      // country1=germany&country2=france
      List<String> list = dao4.select5(dto);
      System.out.println("list = " + list);
   }

   @GetMapping("sub6")
   public void method6(MyDto27 dto1, MyDto28 dto2) {
      // main30/sub6?from=1996-09-01&to=1996-09-30
      Integer num = dao4.select6(dto1, dto2);
      System.out.println("num = " + num);
   }

   @GetMapping("sub7")
   public void method7(MyDto29 dto1, MyDto30 dto2) {
      // page=2&rows=10&keyword=a
      List<String> list = dao4.select7(dto1, dto2);

      dto1.setFrom((dto1.getPage() - 1) * dto1.getRows());
      dto2.setKeyword("%" + dto2.getKeyword() + "%");

      list.forEach(System.out::println);
   }

   @GetMapping("sub8")
   public void method8(MyDto31 dto) {
      // main30/sub8?name=kim&country=daegu
      int row = dao4.insert1(dto);
      System.out.println(row + " 행이 입력되었음!");
   }

   @GetMapping("sub9")
   public void method9() {

   }

   @PostMapping("sub10")
   public void mehtod10(MyDto32 dto) {
      int row = dao4.insert2(dto);
      System.out.println(row + "행이 입력됨");
   }
}
