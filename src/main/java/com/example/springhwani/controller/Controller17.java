package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto14;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main17")
public class Controller17 {

    @Autowired
    private ServletContext application;

    @PostConstruct
    private void init() {
        application.setAttribute("posts", new ArrayList<MyDto14>());
    }

    @GetMapping("List")
    public void List(Model model) {
        Object list = application.getAttribute("posts");
        model.addAttribute("postList", list);
    }

    @GetMapping("new")
    public void newPost() {
    }

    @PostMapping("new")
    public String newPost(MyDto14 post) {
        Object posts = application.getAttribute("posts");
        List<MyDto14> list = (List<MyDto14>) posts;
        list.add(post);

        System.out.println("새글 잘 들어 감.");

        return "redirect:/main17/list";
    }

    @GetMapping("view")
    public void view(Integer id, Model model) {
        List<MyDto14> list = (List<MyDto14>) application.getAttribute("posts");
        model.addAttribute("post", list.get(id));


    }
}
