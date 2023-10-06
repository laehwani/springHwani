package com.example.springhwani.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main21")
public class Controller21 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() throws SQLException {
        String sql = """
            SELECT CustomerName `full name`, Country 
            FROM customers
            WHERE CustomerID <= 3
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            System.out.println("고객 목록");
            while (resultSet.next()) {
//                String name = resultSet.getString(1);
//                String country = resultSet.getString(2);

                String name = resultSet.getString("full name");
                String country = resultSet.getString("Country");

                System.out.println(name + " = " + country);
            }
        }
    }

    @GetMapping("sub2")
    public void method2() throws SQLException {
        String sql = """
            SELECT CONCAT(LastName,', ',FirstName) `fullName`, 
            BirthDate `birth`,
            Notes `DESC`
            FROM employees                        
            """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        try (connection; statement; resultSet) {
            System.out.println("직원 목록#");
            while (resultSet.next()) {
                String name = resultSet.getString("fullName");
                String birth = resultSet.getString("birth");
                String desc = resultSet.getString("DESC");

                System.out.println(name + " : "+ birth +", "+ desc);
            }
        }
    }
}
