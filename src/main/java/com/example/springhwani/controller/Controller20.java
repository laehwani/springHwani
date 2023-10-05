package com.example.springhwani.controller;

import com.example.springhwani.domain.MyDto15;
import com.example.springhwani.domain.MyDto17product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main20")
public class Controller20 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() {
    }

    @GetMapping("sub2")
    public String method2(String id, Model model) throws SQLException {
        // 쿼리 작성
        String sql = """
            SELECT CustomerID, CustomerName, Address, Country
            FROM customers
            WHERE CustomerID = ? 
            """;
        System.out.println("sql = " + sql);

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
//        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery();

        List<MyDto15> list = new ArrayList<>();

        // 쿼리 실행
        try (connection; statement; resultSet) {
            // 실행 결과 처리
            while (resultSet.next()) {
                MyDto15 customer = new MyDto15();
                customer.setId(resultSet.getInt(1));
                customer.setName(resultSet.getString(2));
                customer.setAddress(resultSet.getString(3));
                customer.setCountry(resultSet.getString(4));

                list.add(customer);
            }
        }
        // 처리한 결과 모델에 넣기
        model.addAttribute("customerList", list);
        return "/main19/sub6";
    }

    @GetMapping("sub3")
    public void method3(String id) throws SQLException {
        String sql = """
            SELECT customerId, customerName, country
            FROM customers
            WHERE customerId = ? 
            """;

        Connection connection = dataSource.getConnection();
        // PreparedStatement 를 쓸 때 물음표가 있는 sql 을 넣어준다.
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
//        statement.setInt(1, 3);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {

            while (resultSet.next()) {
                System.out.println("resultSet = " + resultSet);
                System.out.println("id = " + resultSet.getString(1));
                System.out.println("name = " + resultSet.getString(2));
            }
        }
    }

    @GetMapping("sub4")
    public void method4(String id, String name) throws SQLException {
        String sql = """
            SELECT ProductID, ProductName, Price
            FROM products
            WHERE ProductID = ? or ProductName = ?
            """;

        Connection connection = dataSource.getConnection();
        // PreparedStatement 를 쓸 때 물음표가 있는 sql 을 넣어준다.
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, id);
        statement.setString(2, name);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                System.out.println("상품 정보");
                System.out.println("상품번호 = " + resultSet.getInt(1));
                System.out.println("상품명 = " + resultSet.getString(2));
            }
        }
    }

    // /main20/sub5?country=spain
    // 콘솔에 spain에 사는 고객 이름 출력
    @GetMapping("sub5")
    public void method5(String country) throws SQLException {
        String sql = """
            SELECT CustomerID, ContactName, Country
            FROM customers
            WHERE Country = ?
            """;

        // PreparedStatement 를 쓸 때 물음표가 있는 sql 을 넣어준다.
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, country);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                System.out.println("고객 정보");
                System.out.println("고객 ID = " + resultSet.getInt(1));
                System.out.println("고객 이름 = " + resultSet.getString(2));
                System.out.println("고객 국가 = " + resultSet.getString(3));

            }
        }
    }

    @GetMapping("sub6")
    public void method6(String c1, String c2) throws SQLException {
        String sql = """
            SELECT CustomerID, CustomerName, Country
            FROM customers
            WHERE Country = ? OR Country = ?
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, c1);
        statement.setString(2, c2);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                System.out.println("고객 정보");
                System.out.println("고객 ID = " + resultSet.getInt(1));
                System.out.println("고객 이름 = " + resultSet.getString(2));
                System.out.println("고객 국가 = " + resultSet.getString(3));

            }
        }
    }

    @GetMapping("sub7")
    public void method7() {
    }

    @GetMapping("sub8")
    public String method8(Double min, Double max, Model model) throws SQLException {

        String sql = """
            SELECT ProductID, ProductName, Unit, Price
            FROM products
            WHERE Price <= ? AND Price >= ?
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, max);
        statement.setDouble(2, min);
        ResultSet resultSet = statement.executeQuery();

        List<MyDto17product> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {

                MyDto17product product = new MyDto17product();
                product.setId(resultSet.getString(1));
                product.setName(resultSet.getString(2));
                product.setUnit(resultSet.getString(3));
                product.setPrice(resultSet.getString(4));

                list.add(product);
            }
        }
        model.addAttribute("productList", list);

        return "/main19/sub5";
    }

    // /main20/sub9?country=spain&country=mexico&country=uk
    @GetMapping("sub9")
    public void method9(String[] country) throws SQLException {
        // 특정 국가에 속한 고객들 조회
        String sql = """
            SELECT * FROM customers
            WHERE Country IN (?)
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                String name = resultSet.getString(2);
                String country1 = resultSet.getString(7);
                System.out.println("고객 정보");
                System.out.println("country = " + country1);
            }
        }
    }

    @GetMapping("sub10")
    public void method10(Model model) throws SQLException {
        // 공급자의 국가 목록 조회
        String sql = """
            SELECT DISTINCT Country
            FROM suppliers
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        List<String> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                list.add(resultSet.getString(1));

            }
        }
        model.addAttribute("countryList", list);
    }

    @GetMapping("sub11")
    public String method11(@RequestParam("country") List<String> countryList, Model model) throws SQLException {
        String question = "";
        for (int i = 0; i < countryList.size(); i++) {
            question += "?";

            if (i < countryList.size()-1) {
                question += ", ";
            }
        }

        String sql = """
            SELECT SupplierID, SupplierName, Address, Country
            FROM suppliers
            WHERE Country IN(""" + question +
            """
            ) 
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
//        Statement statement = connection.createStatement();
        for (int i = 0; i < countryList.size(); i++) {
            statement.setString(i + 1, countryList.get(i));
        }
        ResultSet resultSet = statement.executeQuery();

        List<MyDto15> list = new ArrayList<>();

        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto15 supplier = new MyDto15();
                supplier.setId(resultSet.getInt(1));
                supplier.setName(resultSet.getString(2));
                supplier.setAddress(resultSet.getString(3));
                supplier.setCountry(resultSet.getString(4));

                list.add(supplier);
            }
        }
        model.addAttribute("countryList", list);
        return "/main19/sub7";
    }
}
