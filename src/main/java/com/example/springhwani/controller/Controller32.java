package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao6;
import com.example.springhwani.domain.MyDto37;
import com.example.springhwani.domain.MyDto38;
import com.example.springhwani.service.MyService1;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("main32")
@RequiredArgsConstructor
public class Controller32 {

   private final MyDao6 dao6;
   private final MyService1 conponent1;

   @GetMapping("sub1")
   public void method1(MyDto37 dto) {
      dao6.insert1(dto);
      System.out.println("dto = " + dto);
   }

   // /main32/sub2?lastName=화니
   @GetMapping("sub2")
   public void method2(MyDto38 dto38) {
      dao6.insert2(dto38);
      System.out.println("dto38 = " + dto38);
      // 직원 테이블에 lastName 입력
   }

   @GetMapping("sub3")
   public void method3() {

   }

   @PostMapping("sub4")
   public String method4(MyDto38 dto38, RedirectAttributes rttr) {
      dao6.insert3(dto38);

      rttr.addFlashAttribute("message",
         dto38.getId() + "번 직원이 등록되었음");
      return "redirect:/main32/sub3";
   }

   @GetMapping("sub5")
   public void method5() {
      try{
         conponent1.tx1();

      }finally {
         List<Map<Object, String>> list = dao6.select3();
         System.out.println("list = " + list);
      }

   }
}
