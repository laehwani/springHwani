package com.example.springhwani.dao;

import com.example.springhwani.domain.MyDto37;
import com.example.springhwani.domain.MyDto38;
import java.util.List;
import java.util.Map;
import lombok.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MyDao6 {

   @Insert("""
      INSERT INTO customers(CustomerName)
      VALUE (#{name})
      """)
   @Options(useGeneratedKeys = true, keyProperty = "id")
   int insert1(MyDto37 dto);


   @Insert("""
      INSERT INTO employees(LastName)
      VALUE (#{lastName})
      """)
   @Options(useGeneratedKeys = true, keyProperty = "id")
   int insert2(MyDto38 dto38);

   @Insert("""
      INSERT INTO employees(lastName, firstName)
      VALUES (#{lastName}, #{firstName})
      """)
   @Options(useGeneratedKeys = true, keyProperty = "id")
   int insert3(MyDto38 dto38);

   @Update("""
      UPDATE bank
      SET money = money - 1000
      WHERE name = 'son'
      """)
   int update1();
   @Update("""
      UPDATE bank
      SET money = money + 1000
      WHERE name = 'kim'
      """)
   int update2();
   @Select("""
      SELECT *
      FROM bank
      ORDER BY name
      """)
   List<Map<Object, String>> select3();
   
}
