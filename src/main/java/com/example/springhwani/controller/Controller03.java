package com.example.springhwani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main2")
public class Controller03 {
    // /main2/sub1?address=seoul
    @RequestMapping("sub1")
    public void method1(WebRequest request) {
        // 리퀘스트지역에서 오는 요청을 받을때 WebRequest 를 쓴다.
        System.out.println("Controller03.method1");

        String address = request.getParameter("address");
        System.out.println("address : "+ address );
    }

    // /main2/sub2?name=son&address=seoul
    @RequestMapping("sub2")
    public void method2(WebRequest request) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        System.out.println("address = " + address);
        System.out.println("name = "+ name);
    }

    // /main2/sub3?name=당근&address=갇혀있어요&action=살려주세요
    @RequestMapping("sub3")
    public void method3(@RequestParam("name") String name,
        @RequestParam("address")String address,
        @RequestParam("action")String action) {

        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("action = " + action);
    }

    // /main2/sub5?email=abc@gmail.com&gender=남자&number=111
    @RequestMapping("sub5")
    public void method5(@RequestParam("email")String email,
        @RequestParam("gender")String gender,
        @RequestParam("number")String number) {

        System.out.println("email = " + email);
        System.out.println("gender = " + gender);
        System.out.println("number = " + number);
    }

    @RequestMapping("sub6")
    public void method6(@RequestParam("name")String name,
                        @RequestParam("age")String age) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);

    }
    // 위에 코드에서 age 는 숫자로 받고 싶다면? 아래
    // /main2/sub7?name=소니&age=40
    @RequestMapping("sub7")
    public void method7(@RequestParam("name")String name,
        @RequestParam("age")Integer age) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    // /main2/sub8?address=seoul&married=false&age=66
    @RequestMapping("sub8")
    public void method8(@RequestParam("address") String address,
        @RequestParam("married")Boolean married,
        @RequestParam("age")Integer age) {

        System.out.println("address = " + address);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
    }

    // 리퀘스트파라미터에 파라미터값을 넣지 않으면 에러가 뜬다.
    // 값을 넣지 않아도 출력을 원한다면 required 를 추가하면 된다.
    @RequestMapping("sub9")
    public void method8(@RequestParam(value = "name", required = false)String name) {
        System.out.println("name = " + name);
    }

    // /main2/sub10?address=seoul&age=30
    // /main2/sub10?address=jeju
    // age 를 빼고 address 값만 출력되길 원한다면?
    @RequestMapping("sub10")
    public void method10(@RequestParam("address")String address,
        @RequestParam(value = "age",required = false)Integer age) {

        System.out.println("address = " + address);
        System.out.println("age = " + age);
    }

    // defaultValue 에 대해 알아보자
    // 디폴트값을 넣은후 /main2/sub11 요청해보기
    @RequestMapping("sub11")
    public void method11(@RequestParam(value = "age", defaultValue = "40")Integer age) {
        System.out.println("age = " + age);
    }
}
