package com.example.springhwani.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao5 {


   @Select("""
      <script>
         SELECT COUNT(*)
         FROM customers
         
         <if test= 'country != null'>
         WHERE Country = #{country}
         </if>
      </script>
      """)
   String select1(String country);

   @Select("""
      <script>
      SELECT CustomerName
      FROM customers;
      <if test='num == 10 '>
      -- 수가 10이다.
      </if>
      <if test='num != 10 '>
      -- 수가 10이 아니다.
      </if>
      <if test='num > 10 '>
      -- 수가 10보다 크다.
      </if>
      <if test='num < 10 '>
      -- 수가 10보다 작다. 인데 에러가 난다.
      -- 이유를 찾아보세요.
      -- num lt 10
      </if>
      <if test='num >= 10 '>
      -- 수가 10보다 크거나 같다.
      </if>
      <if test='num <= 10 '>
      -- 수가 10보다 작거나 같다. 인데 에러가 난다.
      -- num lte 10
      </if>
      </script>
      """)
   List<String> select2(Integer number);


}
