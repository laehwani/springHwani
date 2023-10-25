package com.example.springhwani.dao;

import com.example.springhwani.domain.MyDto33Employee;
import com.example.springhwani.domain.MyDto45;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.eclipse.tags.shaded.org.apache.xpath.operations.String;

@Mapper
public interface MyDao8 {

   @Select("""
      SELECT *
      FROM products
      WHERE ProductID = #{id}
      """)
   Map<String, Object> selectProductId(Integer id);

   @Select("""
      SELECT employeeid id, 
         lastname, 
         firstname, 
         birthdate, 
         photo, 
         notes
      FROM employees
      WHERE EmployeeID = #{id}
      """)
   MyDto33Employee selectByEmployeeId(Integer id);

   @Select("""
SELECT p.ProductID id, 
   p.Price,
   c.CategoryName category,
   p.Unit 
   FROM products p
   JOIN w3schools.categories c on p.CategoryID = c.CategoryID
   WHERE p.ProductID = #{id}
""")
   MyDto45 selectByProductId(Integer id);

}

