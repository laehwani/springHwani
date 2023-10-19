package com.example.springhwani.dao;

import com.example.springhwani.domain.MyDto25;
import com.example.springhwani.domain.MyDto26;
import com.example.springhwani.domain.MyDto27;
import com.example.springhwani.domain.MyDto28;
import com.example.springhwani.domain.MyDto29;
import com.example.springhwani.domain.MyDto30;
import com.example.springhwani.domain.MyDto31;
import com.example.springhwani.domain.MyDto32;
import com.example.springhwani.domain.MyDto33Employee;
import com.example.springhwani.domain.MyDto34Customer;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MyDao4 {

   @Select("""
      SELECT CustomerName 
      FROM customers
      WHERE CustomerID = #{asdf}
      """)
   // 파라미터가 하나면 이름이 일치하지 않아도 됨.
   // 파라미터가 두개 이상이면 이름이 꼭 일치해야 됨.
   String select1(int asdf);

   @Select("""
      SELECT ProductName
      FROM products
      WHERE Price BETWEEN #{from} AND #{to}
      """)
   List<String> select2(Double from, Double to);

   @Select("""
      SELECT DISTINCT p.ProductName 상품명, o2.OrderDate 주문날짜, o.Quantity 수량
      FROM products p 
      JOIN w3schools.orderdetails o on p.ProductID = o.ProductID
      JOIN w3schools.orders o2 on o.OrderID = o2.OrderID
      WHERE o2.OrderDate BETWEEN #{from} AND #{to}
      ORDER BY p.ProductName
      """)
   List<Map<String, Object>> select3(LocalDate from, LocalDate to);

   @Select("""
      SELECT ProductName
      FROM products
      WHERE Price BETWEEN #{min} AND #{max}
      """)
   List<String> select4(MyDto25 dto);

   @Select("""
      SELECT CustomerName 
      FROM customers
      WHERE Country = #{country1} OR #{country2}
      """)
   List<String> select5(MyDto26 dto);

   @Select("""
      SELECT COUNT(OrderID) 
      FROM orders
      WHERE OrderDate BETWEEN #{dto1.from} AND #{dto2.to}
      """)
   Integer select6(MyDto27 dto1, MyDto28 dto2);

   @Select("""
      SELECT CustomerName
      FROM customers
      WHERE CustomerName LIKE #{dto2.keyword}
      LIMIT #{dto1.from},#{dto1.rows}
      """)
   List<String> select7(MyDto29 dto1, MyDto30 dto2);

   @Insert("""
      INSERT INTO customers (CustomerName, Country)
      VALUE (#{name}, #{country})
      """)
   int insert1(MyDto31 dto);

   @Insert("""
      INSERT INTO employees (LastName, FirstName)
      VALUE (#{lastName}, #{firstName})
      """)
   int insert2(MyDto32 dto);

   @Delete("""
      DELETE FROM employees
      WHERE EmployeeID = #{id}

      """)
   Integer delete1(Integer id);

   @Delete("""
      DELETE FROM products
      WHERE ProductID = #{id}
      """)
   int delete2(Integer id);

   @Select("""
      SELECT EmployeeID id, LastName, FirstName, Photo, Notes, BirthDate
      FROM employees
      WHERE EmployeeID = #{id}
      """)
   MyDto33Employee select8(Integer id);

   @Update("""
      UPDATE employees
      SET LastName = #{lastName},
      FirstName = #{firstName},
      Photo = #{photo},
      BirthDate = #{birthDate},
      Notes = #{notes}
      WHERE EmployeeID = 1
      """)
   int update1(MyDto33Employee employee);

   @Select("""
SELECT CustomerID id, CustomerName name, Address, Country
FROM customers
WHERE CustomerID = #{id}
""")
   MyDto34Customer select9(Integer id);

   @Update("""
      UPDATE customers
      SET CustomerID = #{id},
      CustomerName = #{name},
      Address = #{address},
      Country = #{country}
      WHERE CustomerID = #{id}
      """)
   int update2(MyDto34Customer customer);
}

