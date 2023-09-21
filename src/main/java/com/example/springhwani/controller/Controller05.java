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
    }


//     /main5/sub2?name=lee&age=44&address=paris
    @RequestMapping("sub2")
    public void method2(String name, Integer age, String address) {
        Person5 o1 = new Person5();
        o1.setName(name);
        o1.setAge(age);
        o1.setAddress(address);

        System.out.println(o1);
    }

    // /main5/sub2?name=lee&age=44&address=paris
    // sub3 의 예제를 보고 이 방법을 중점적으로 익히자.
    @RequestMapping("sub3")
    public void method3(Person5 person5) {
        System.out.println("person5 = " + person5);
    }
}

class Person5 {
    private String name;
    private Integer age;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person5{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }
}
// /main5/sub4?email=ab@gmail.com&married=true&age==33&info=programmer
