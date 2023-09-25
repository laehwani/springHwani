package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto10;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main11")
public class Controller11 {

    @RequestMapping("sub1")
    public void method1() {
    }

    @RequestMapping("sub2")
    public void method2() {
    }

    @RequestMapping("sub3")
    public void method3() {
    }

    @RequestMapping({"sub4", "sub5", "sub6"})
    public void method4() {
    }

    @RequestMapping("sub7")
    public void method7(@RequestParam
        (value = "show",
        defaultValue = "false") Boolean show, Model model) {

        if (show) {
        List<MyDto10> list = new ArrayList<>();
        list.add(new MyDto10("31", "chi", "ckin", "닭", 02));
        list.add(new MyDto10("32", "pi", "zza", "빵", 011));
        list.add(new MyDto10("33", "ham", "burger", "버거", 010));
        list.add(new MyDto10("34", "cow", "meat", "고기", 30));
        list.add(new MyDto10("35", "pig", "meat", "꼬기", 40));

        model.addAttribute("moving", list);
        }

    }
}

