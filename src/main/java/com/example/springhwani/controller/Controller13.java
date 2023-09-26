package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto11;
import com.example.springhwani.domain.MyDto12;
import com.example.springhwani.domain.MyDto13;
import java.sql.Struct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main13")
public class Controller13 {

    @RequestMapping({"sub1", "sub2", "sub7", "sub9","sub11", "sub13"})
    public void method1() {
    }

    @RequestMapping("sub3")
    public void method3(
        String param1,
        Integer param2,
        String param3,
        LocalDate param4,   // LocalDate 는
        LocalDateTime param5,    // 날짜 데이터타입
        String param6,
        @RequestParam(value = "param8") String[] param8,
        @RequestParam("param8") List<String> param9
    ) {

        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        System.out.println("param3 = " + param3);
        System.out.println("param4 = " + param4);
        System.out.println("param5 = " + param5);
        System.out.println("param6 = " + param6);
        System.out.println("param8 = " + param8);
        System.out.println("param9 = " + param9);

        if (param8 != null) {
            Arrays.stream(param8).forEach(System.out::println);
        }

        System.out.println("list로 받음");
        param9.forEach(System.out::println);
    }

    @RequestMapping("sub4")
    public void method4() {
    }

    @RequestMapping("sub5")
    public void method5(

        @RequestParam("userId") String id,
        @RequestParam("userEmail") String email,
        @RequestParam("birthDate") LocalDate birth,
        @RequestParam("hobby") List<String> hobby
    ) {

        System.out.println("input1 = " + id);
        System.out.println("input2 = " + email);
        System.out.println("input3 = " + birth);
        System.out.println("input4 = " + hobby);

        System.out.println("취미 생활");
        hobby.forEach(System.out::println);
    }

    @RequestMapping("sub6")
    public void method06(MyDto11 user) {
        System.out.println("user : " + user);
    }

    @RequestMapping("sub8")
    public void method7(MyDto12 info) {
        System.out.println("info = " + info);
    }

    @RequestMapping("sub10")
    public void method10(
        @RequestParam("title") String title,
        @RequestParam("contentBody") String contentBody
    ) {
        System.out.println("title = " + title);
        System.out.println("contentBody = " + contentBody);
    }

    @RequestMapping("sub12")
    public void method12(MyDto13 info) {
        System.out.println("info = " + info);
    }

    @RequestMapping("sub14")
    public void method14(
        @RequestParam("hobby") String hobby,
        @RequestParam("food") List<String> food
    ) {
        System.out.println("hobby = " + hobby);
        System.out.println("food = " + food);
    }
}
