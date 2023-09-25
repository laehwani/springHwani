package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto09;
import com.example.springhwani.domain.MyDto10;
import java.util.ArrayList;
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
        MyDto09 o1 = new MyDto09("");
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
        model.addAttribute("foodList",
            List.of("pizza", "milk", "water", "salad"));
        model.addAttribute("names", List.of("화니", "소미", "현이", "영이"));
    }

    @RequestMapping("sub6")
    public void method6(Model model) {
        List<MyDto10> list = new ArrayList<>();
        list.add(new MyDto10("31", "chi", "ckin", "닭", 02));
        list.add(new MyDto10("32", "pi", "zza", "빵", 011));
        list.add(new MyDto10("33", "ham", "burger", "버거", 010));
        list.add(new MyDto10("34", "cow", "meat", "고기", 30));
        list.add(new MyDto10("35", "pig", "meat", "꼬기", 40));

        model.addAttribute("moving", list);
    }

    @RequestMapping("sub7")
    public void method7(Model model) {
        model.addAttribute("a", 3);
        model.addAttribute("b", 5);

        model.addAttribute("c", "8");
        model.addAttribute("d", "9");
    }

    @RequestMapping("sub8")
    public void method8(Model model) {
        model.addAttribute("a", 3);
        model.addAttribute("b", 5);

        model.addAttribute("c", "java");
        model.addAttribute("d", "spring");

        model.addAttribute("e", "11");
        model.addAttribute("f", "2");
        // ${e >f} ?
    }

    @RequestMapping("sub9")
    public void method9(Model model) {
        model.addAttribute("a", "java");
        model.addAttribute("b", "");

        model.addAttribute("c", List.of(3, 4));
        model.addAttribute("d", List.of());

        model.addAttribute("e", Map.of("name", "son"));
        model.addAttribute("f", Map.of());

        model.addAttribute("g", null);

    }
}

