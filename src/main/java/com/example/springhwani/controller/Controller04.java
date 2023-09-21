package com.example.springhwani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main4")
public class Controller04 {

    // /main4/sub1?name=son
    // request paratmeter 의 이름과 method parameter 의 이름이 같으면
    // @RequestParam 의 value element 생략 가능하다.
    @RequestMapping("sub1")
    public void method1(@RequestParam String name) {
        System.out.println("name = " + name);
    }

    // /main4/sub2?address=서울&action=갇혀있어요&rescue=살려주세요
    @RequestMapping("sub2")
    public void method2(@RequestParam String address,
        @RequestParam String action,
        @RequestParam String rescue) {

        System.out.println("address = " + address);
        System.out.println("action = " + action);
        System.out.println("rescue = " + rescue);
    }

    // annotation 도 생략이 가능하다
    // /main4/sub3?name=son&married=true
    @RequestMapping("sub3")
    public void method3(String name, boolean married) {
        System.out.println("name = " + name);
        System.out.println("married = " + married);
    }

    // /main4/sub4?check=갇혀있어요&name=당근당근&dang=true
    @RequestMapping("sub4")
    public void method4(String check, String name, boolean dang) {
        System.out.println(check);
        System.out.println(name);
        System.out.println("당근흔들기" + dang);
    }
}
