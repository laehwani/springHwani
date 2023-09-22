package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto09;
import com.example.springhwani.domain.MyDto10;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main10")
public class Controller10 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        MyDto10 o1 = new MyDto10();
        MyDto10 o2 = new MyDto10();
        MyDto10 o3 = new MyDto10();

        o1.setFirstName("hwani😎😎");
        o2.setFirstName("dasom😊😊");
        o3.setFirstName("hyun😂😂");

        model.addAttribute("studentList", List.of(o1, o2, o3));
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        MyDto10 o1 = new MyDto10();
        MyDto10 o2 = new MyDto10();

        o1.setFirstName("hwani😎😎");
        o2.setFirstName("dasom😊😊");
        o1.setClassName("룰루~");
        o2.setClassName("랄라~");

        model.addAttribute("personMap",
            Map.of("person1", o1, "person2", o2));

        model.addAttribute("people",
            Map.of("1st", o1, "2nd", o2));
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        MyDto09 o1 = new MyDto09();
        o1.setName("");
        o1.setId(3);
//        o1.setFoods(List.of("pizza","hambur","milk"));
//        o1.setCars(List.of("그렌져","모닝","레이"));
        model.addAttribute("person1", o1);
        model.addAttribute("person1", o1);
    }

//    @RequestMapping("sub4")
//    public void method4(Model model) {
//
////        model.addAttribute()
//    }

    @RequestMapping("sub5")
    public void method4(Model model) {
        model.addAttribute("foodList", List.of("햄", "버", "거", "임"));
        model.addAttribute("names", List.of("화니", "소미", "현이", "영이"));
    }
}

