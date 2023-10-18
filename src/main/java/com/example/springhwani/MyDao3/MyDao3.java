package com.example.springhwani.MyDao3;

import com.example.springhwani.domain.MyDto19;
import com.example.springhwani.domain.MyDto20;
import com.example.springhwani.domain.MyDto21;
import com.example.springhwani.domain.MyDto22;
import com.example.springhwani.domain.MyDto23;
import com.example.springhwani.domain.MyDto24;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao3 {

   @Select("""
         SELECT CustomerName FROM customers
         WHERE CustomerID = 1
         
      """)
   String select1();

   @Select("""
      SELECT Price FROM products
      WHERE ProductID = 1
      """)
   Double select2();

   @Select("""
         SELECT LastName FROM employees
         WHERE EmployeeID = 1
      """)
   String select3();

   @Select("""
         SELECT BirthDate FROM employees
         WHERE EmployeeID = 2
      """)
   String select4();

   @Select("""
      SELECT DISTINCT Country FROM customers
      ORDER BY 1
      """)
   List<String> select5();

   @Select("""
      SELECT BirthDate FROM employees
      ORDER BY 1
      """)
   List<LocalDate> select6();

   @Select("""
      SELECT Price FROM products
      ORDER BY 1
      """)
   List<Double> select7();

   // 하나의 행, 여러개의 열
   // Map<> 으로 받는게 핵심
   @Select("""
      SELECT CustomerID, CustomerName, Address FROM customers
      WHERE CustomerID = 1
      """)
   Map<String, Object> select8();

   @Select("""
      SELECT p.ProductName, p.Price, c.CategoryName 
      FROM products p 
      JOIN w3schools.categories c 
      on p.CategoryID = c.CategoryID
      WHERE ProductID = 1
      """)
  Map<String, Object> select9();

   // java bean 으로 받아보자
   @Select("""
      SELECT EmployeeID, LastName, FirstName FROM employees
      WHERE EmployeeID = 1
      """)
   MyDto19 select10();

   @Select("""
      SELECT ProductName name, Price, CategoryName category
      FROM products p
      JOIN categories c 
      ON p.CategoryID = c.CategoryID
      WHERE c.CategoryID = 1
      """)
   MyDto20 select11();

   @Select("""
      SELECT CustomerID id , CustomerName name, Country
      FROM customers 
      WHERE CustomerID = 2
      """)
   MyDto21 select12();

   @Select("""
      SELECT ProductID id, ProductName name, Price
      FROM products
      WHERE CategoryID = 2
      ORDER BY Price
      """)
   List<Map<String, Object>> select13();


   @Select("""
SELECT p.ProductName 상품명, p.Price 가격, o.Quantity 수량
FROM products p
JOIN w3schools.orderdetails o on p.ProductID = o.ProductID
JOIN w3schools.orders o2 on o.OrderID = o2.OrderID
WHERE OrderDate = '1996-07-04'
""")
   List<Map<String, Object>> select14();

   @Select("""
SELECT p.ProductName 상품명, p.Price 가격, o.Quantity 수량
FROM products p
JOIN w3schools.orderdetails o on p.ProductID = o.ProductID
JOIN w3schools.orders o2 on o.OrderID = o2.OrderID
WHERE OrderDate = '1996-07-04'
""")
   List<MyDto22> select15();

   @Select("""
      SELECT p.CategoryID id, o.OrderDate 날짜, p.ProductName 상품, c.CategoryName 카테고리, ord.Quantity 수량, p.Price 가격
      FROM products p
         JOIN w3schools.orderdetails ord 
            on p.ProductID = ord.ProductID
         JOIN w3schools.orders o 
            on ord.OrderID = o.OrderID
         JOIN w3schools.categories c 
            on p.CategoryID = c.CategoryID
      WHERE p.CategoryID = 1 
      AND OrderDate >= '1996-01-01' AND OrderDate < '1996-12-31' 
      """)
   List<MyDto23> select16();

   @Select("""
      SELECT CustomerName 
      FROM customers
      WHERE CustomerID = 100
      """)
   String select17();

   @Select("""
      SELECT CustomerID 
      FROM customers
      WHERE CustomerID = 100
      """)
   Integer select18();

   @Select("""
      SELECT CustomerID id, CustomerName name, Country
      FROM customers
      WHERE CustomerID = 1
      """)
   MyDto24 select19();

   @Select("""
      SELECT CustomerID id, CustomerName name, Country
      FROM customers
      WHERE CustomerID > 1
      """)
   MyDto24 select20();
}

