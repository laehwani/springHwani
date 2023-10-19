package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao4;
import com.example.springhwani.domain.MyDto25;
import com.example.springhwani.domain.MyDto26;
import com.example.springhwani.domain.MyDto27;
import com.example.springhwani.domain.MyDto28;
import com.example.springhwani.domain.MyDto29;
import com.example.springhwani.domain.MyDto30;
import com.example.springhwani.domain.MyDto31;
import com.example.springhwani.domain.MyDto32;
import com.example.springhwani.domain.MyDto33Employee;
import com.example.springhwani.domain.MyDto34Customer;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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


   // DELETE : 지우는 법을 알아보자
   @GetMapping("sub11")
   public void method11(Integer id) {
      Integer rows = dao4.delete1(id);
      System.out.println(rows + "행이 지워짐");
   }

   // 3번 상품이 삭제되는 메소드 완성
   @GetMapping("sub12")
   public void method12(Integer id) {
      int rows = dao4.delete2(id);
      System.out.println(rows + "행이 지워짐");
   }

   // update : 테이블 수정을 알아보
   @GetMapping("sub13")
   public void method13(Integer id, Model model) {
      // 직원을 조회
      MyDto33Employee employee = dao4.select8(id);

      model.addAttribute("employee", employee);
   }

   @PostMapping("sub14")
   public String method14(MyDto33Employee employee, RedirectAttributes attr) {
      int rows = dao4.update1(employee);

      // 모델에 추가하기
      if (rows == 1) {
         attr.addFlashAttribute("message", "정보가 수정되었음");
      } else {
         attr.addFlashAttribute("message", "정보가 수정안됨");
      }
      // 쿼리 스트링을 추가하기
      attr.addAttribute("id", employee.getId());

      return "redirect:/main30/sub13";
   }

   // /main30/sub15?id=3
   // 3번 고객 조회 -> view 로 포워딩
   @GetMapping("sub15")
   public void method15(Integer id, Model model) {
      MyDto34Customer customer = dao4.select9(id);
      model.addAttribute("customer", customer);
   }

   @PostMapping("sub16")
   public String method16(MyDto34Customer customer, RedirectAttributes rttr) {
      int rows = dao4.update2(customer);
      if (rows == 1) {
         rttr.addFlashAttribute("message", "정보가 수정되었음!");
      } else {
         rttr.addFlashAttribute("message", "정보가 수정안됨");
      }
      // 쿼리스트링에 넣자
      // main30/sub?id=#{} 로 redirect 해라
      rttr.addAttribute("id", customer.getId());

      return "redirect:/main30/sub15";
   }

}
