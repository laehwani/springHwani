package com.example.springhwani.dao;

import com.example.springhwani.domain.MyDto18Employee;
import com.example.springhwani.domain.MyDto34Customer;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao10 {
//
//   @Select("""
//        SELECT CustomerName FROM customers
//        WHERE CustomerID = 50
//        """)
//   String getCustomerName();

   @Select("""
        SELECT 
         customerId id,
         customerName name,
         contactName,
         address,
         city,
         postalCode, 
         country
         FROM customers
        WHERE customerId = 50
        """)
   MyDto34Customer getCustomer();

   @Select("""
        SELECT 
         customerId id,
         customerName name,
         contactName,
         address,
         city,
         postalCode, 
         country
         FROM customers
        WHERE customerId = #{id}
        """)
   MyDto34Customer getCustomerById(Integer id);

   @Select("""
    SELECT EmployeeID id, LastName, FirstName, BirthDate, Photo, Notes
    FROM employees
    WHERE EmployeeID = #{id}
""")
   MyDto18Employee getEmployeeId(Integer id);

   @Select("""
      SELECT EmployeeID FROM employees
      ORDER BY EmployeeID
      """)
   List<Integer> getEmployeeIdList();
}