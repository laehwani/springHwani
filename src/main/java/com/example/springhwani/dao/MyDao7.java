package com.example.springhwani.dao;


import com.example.springhwani.domain.MyDto38;
import com.example.springhwani.domain.MyDto40;
import java.time.LocalDate;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.DeleteMapping;

@Mapper
public interface MyDao7 {

   @Select("""
      SELECT *
      FROM products
      WHERE ProductID = #{id}
      """)
   Map<String, Object> selectByProductId(Integer id);

   @Insert("""
            INSERT INTO employees (lastName, firstName, birthDate)
            VALUES (#{lastName}, #{firstName}, #{birthDate})
            """)
   int insertEmployeeId(String lastName, String firstName, LocalDate birthDate);

   @Insert("""
      INSERT INTO products(ProductName, Price, CategoryID)
      VALUES (#{name}, #{price},#{category})
      """)
   int insertProduct(String name, Double price, Integer category);

   @Delete("""
      DELETE FROM products
      WHERE ProductID = #{pid}
      """)
   int deleteByProductId(Integer pid);

   @Delete("""
      DELETE FROM customers
      WHERE CustomerID = #{pid}
      """)
   int deleteByCustomerId(Integer pid);

   @Update("""
      UPDATE products
      SET 
      Price = #{price},
      ProductName = #{name},
      CategoryID = #{category}
      WHERE ProductID = #{id}
      """)
   int updateProduct(MyDto40 dto);

   @Update("""
      UPDATE employees
      SET 
      LastName = #{lastName},
      FirstName = #{firstName},
      BirthDate = #{birthDate}
      WHERE EmployeeID = #{id}
      """)
   int updateEmployeeId(MyDto40 dto40);

   @Update("""
      UPDATE employees
      SET 
      LastName = #{lastName},
      FirstName = #{firstName},
      BirthDate = #{birthDate}
      WHERE EmployeeID = #{id}
      """)
   int updateEmployee(MyDto40 dto40);
}

