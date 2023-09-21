package com.example.springhwani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        // Model 에 담긴 데이터를 attribute 라고 한다.
        // Model 에 atrribute 를 담기 위한 메서드를 알아보자
        // add : 추가하기
        model.addAttribute("attr1","value1");
        model.addAttribute("attr2","여기도 왔다아~~😎😎😎");

        // forward to / WEB-INF/jsp/main8/sub1.jsp
    }
    @RequestMapping("sub2")
    public void method2(Model model) {
        model.addAttribute("propONE", "갇혀있어요 살려주세요");
        model.addAttribute("propTWO", "당근당근당근😭😭😭");

    }
}
