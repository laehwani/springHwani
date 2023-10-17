package com.example.springhwani.controller;

import com.example.springhwani.dao.MyDao1;
import java.sql.SQLException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main27")
@RequiredArgsConstructor
public class Controller27 {

  private final MyDao1 dao;
  @GetMapping("sub1")
  public void method1(Integer id) throws SQLException {
    String select = dao.select(3);

    System.out.println("select = " + select);
  }

}
