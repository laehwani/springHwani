package com.example.springhwani.controller;


import com.example.springhwani.domain.MyDto10;
import com.example.springhwani.domain.MyDto7;
import com.example.springhwani.domain.MyDto8;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "화니😎");
        model.addAttribute("attr2", 300);
        model.addAttribute("attr3", true);

        // 모델 속성이 배열일 경우를 보자
        model.addAttribute("attr4", new String[]{"hwani", "dason", "hyun"});

        String[] myArr1 = {"korea", "busan", "sejong"};
        model.addAttribute("yourArr6", myArr1);
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        model.addAttribute("myName", new String[]{"hwani", "dason", "hyun"});
        model.addAttribute("yourEmail", new String[]{"ab@", "qwer@", "zxcv@"});
        model.addAttribute("herAddress", new char[]{'q', 'w', 'e', 'r'});
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        model.addAttribute("names", List.of("두식", "봉석", "희"));
    }

    @RequestMapping("sub4")
    public void method4(Model model) {

        var list1 = List.of("무빙", "엘리멘탈");
        model.addAttribute("list1", list1);
        var list2 = List.of(1, 2, 3);
        model.addAttribute("mapList1", list2);
        model.addAttribute("cities", List.of("창원", "마산", "진해","세종"));
    }

    // Map 으로 해보자
    @RequestMapping("sub5")
    public void method5(Model model) {
        var map1 = Map.of("son", 7, "lee", 19, "kim", 40);

        model.addAttribute("myMap", map1);

        var map2 = Map.of("seoul", "서울",
            "busan", "부산",
            "sejong", "세종");

        var map3 = Map.of(
            "red", "빨강",
            "yellow", "노랑",
            "blue", "파랑",
            "black","검정",
            "white", "하양");

        model.addAttribute("cityMap", map2);
        model.addAttribute("color", map3);

    }

    @RequestMapping("sub6")
    public void method6(Model model) {

        var map1 = Map.of("phone1","iphone","phone2","galaxy");
        var map2 = Map.of("korea","seoul","us","ny","o1","ks");
        var map3 = Map.of("1st","hamburger","2nd","pizza");

        model.addAttribute("o1", "korea");
        model.addAttribute("phones",map1);
        model.addAttribute("cities",map2);
        model.addAttribute("foods",map3);

        model.addAttribute("attr1", new Object());
        model.addAttribute("attr2", new Scanner(System.in));
        model.addAttribute("attr3", new MyDto7());
        // 퍼블릭 MyDto7 클래스를 새로 만들어주어야 한다.

        // 클래스 복습
        model.addAttribute("attr3", new MyDto7());
    }

    @RequestMapping("sub7")
    public void method7(Model model) {
        MyDto8 o1 = new MyDto8();
        o1.setFood("pizza");
        o1.setComputer("com!");
        o1.setBirthDate("2020-01-01");

        model.addAttribute("person1", o1);
    }

    @RequestMapping("sub8")
    public void method8(Model model) {
        MyDto10 o2 = new MyDto10();
        o2.setId("hwani");
        o2.setFirstName("kim");
        o2.setLastName("hwan");
        o2.setClassName("java");
        o2.setNumber(010);

        model.addAttribute("student", o2);
    }
}
