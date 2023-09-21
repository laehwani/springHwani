package com.example.springhwani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main5")
public class Controller05 {

    // /main5/sub1?name=lee&age=33&address=paris
    // 무조건 넣길 원하는 파라미터값은 params 를 쓰면된다.
    // 여러 개를 한번에 넣길 원한다면 param = { } 로 묶어준다.
    @RequestMapping(value = "sub1",params = {"address","age"})
    public void method(String name, Integer age,String address) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("address = " + address);

//        service.method(name, age, address);
    }

}
