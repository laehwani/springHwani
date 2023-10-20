package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao5;
import com.example.springhwani.domain.MyDto100;
import com.example.springhwani.domain.MyDto36;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

   @GetMapping("sub3")
   // /main31/sub3?code=1&k=ro
   public void method3(Integer code, String k, Model model) {
      // code 가 1이면 select coustomerName, contactName
      List<Map<String, Object>> rows = dao.select3(code, "%" + k + "%");
      model.addAttribute("names", rows);
   }

   @GetMapping("sub4")
   public void method4() {
      dao.select4(30);
   }

   @GetMapping("sub5")
   private void method5(MyDto36 dto, Model model) {
      model.addAttribute("cityList", dao.listCustomerCity());
      model.addAttribute("countryList", dao.listCustomerCountry());
      model.addAttribute("customerList", dao.listCustomer(dto));
   }




   @GetMapping("sub100")
   // /main31/sub100 에 상품코드, 상품명으로 검색하기 만들기
   private String method100(MyDto100 dto, Model model, RedirectAttributes rttr) {
      model.addAttribute("productIdList", dao.listProductId());
//      model.addAttribute("productName", dao.listProductName());
      model.addAttribute("productList", dao.listProduct(dto));

      rttr.addAttribute("message", dto.getId() + "번이 검색되었습니다");
      return "redirect:/main31/sub100";
   }


}
