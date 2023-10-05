package com.example.springhwani.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main18")
public class Controller18 {

    // Get방식으로 해봅시당 /main18/sub1
    @GetMapping("sub1")
    public void method1(Model model) throws SQLException {

        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String username = "root";
        String password = "1234";

        String sql= """
            SELECT customerName
            FROM customers
            WHERE customerID = 1
            """;
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        try(connection; statement) {
            try(resultSet) {
                resultSet.next();
                String name = resultSet.getString(1);
                model.addAttribute("customerName", name);
            }
        }
    }
}
