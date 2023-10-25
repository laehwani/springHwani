package com.example.springhwani.dao;

import com.example.springhwani.domain.MyDto33Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyDao9 {

   @Insert("""
INSERT INTO employees (LastName, FirstName, BirthDate, Notes)
VALUES (#{firstName}, #{lastName}, #{birthDate}, #{notes})
""")
   int insertEmployee(MyDto33Employee dto);

}
