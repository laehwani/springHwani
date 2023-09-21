package com.example.springhwani.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// /main5/sub5?email=ab@gmail.com&married=true&age=33&info=programmer
@Controller
@RequestMapping("main5")
public class Controller06 {

    @RequestMapping("sub5")
    public void method5(Student5 student5) {
        System.out.println("student5 = " + student5);
    }
}

class Student5 {
    private String email;
    private Boolean married;
    private Integer age;
    private String info;

    @Override
    public String toString() {
        return "Student5{" +
            "email='" + email + '\'' +
            ", married=" + married +
            ", age=" + age +
            ", info='" + info + '\'' +
            '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

















































