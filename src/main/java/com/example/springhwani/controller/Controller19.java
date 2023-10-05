package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto15;
import com.example.springhwani.domain.MyDto16;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main19")
public class Controller19 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public String method1(Model model) throws SQLException {
        String sql = """
            SELECT CustomerName
            FROM customers
            WHERE CustomerID = 3
            """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        try (connection; statement; resultSet) {

            resultSet.next();
            String name = resultSet.getString(1);
            model.addAttribute("customerName", name);
        }

        return "/main18/sub1";
    }

    @GetMapping("sub2")
    public void method2() {
        String sql = """
            SELECT *
            FROM Shippers
            """;

//        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        statement.executeQuery(sql);

    }

    @GetMapping("sub4")
    public void method4(Model model) throws SQLException {
        String sql = """
            SELECT CustomerID, CustomerName, City, Country
            FROM customers      
            """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<Map<String, String>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("id", resultSet.getString(1));
                map.put("name", resultSet.getString(2));
                map.put("city", resultSet.getString(3));
                map.put("country", resultSet.getString(4));

                list.add(map);
            }
        }
        model.addAttribute("customers", list);
    }

    @GetMapping("sub5")
    public void method5(Model model) throws SQLException {

        String sql = """
            SELECT ProductID, ProductName, Unit, Price
            FROM products
            """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<Map<String, String>> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("id", resultSet.getString(1));
                map.put("name", resultSet.getString(2));
                map.put("unit", resultSet.getString(3));
                map.put("price", resultSet.getString(4));

                list.add(map);
            }
            model.addAttribute("productList", list);
        }
    }

    @GetMapping("sub6")
    public void method6(Model model) throws SQLException {
        String sql = """
            SELECT CustomerID, CustomerName, Address, Country
            FROM customers
            """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto15> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto15 dto = new MyDto15();
                dto.setId(resultSet.getInt(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));

                list.add(dto);
            }
        }
        model.addAttribute("customerList", list);
    }

    @GetMapping("sub7")
    public String method7(Model model) throws SQLException {
        String sql = """
            SELECT ProductID, ProductName, Unit, Price
            FROM products
            """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto16> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto16 dto = new MyDto16();
                dto.setId(resultSet.getInt(1));
                dto.setName(resultSet.getString(2));
                dto.setUnit(resultSet.getString(3));
                dto.setPrice(resultSet.getInt(4));

                list.add(dto);
            }
        }
        model.addAttribute("productList", list);
        return "/main19/sub5";
    }

}
