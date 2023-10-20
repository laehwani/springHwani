package com.example.springhwani.dao;

import com.example.springhwani.domain.MyDto100;
import com.example.springhwani.domain.MyDto36;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.ui.Model;

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
      <if test='num lt 10 '>
      -- 이유를 찾아보세요.
      -- num lt 10
      </if>
      <if test='num >= 10 '>
      -- 수가 10보다 크거나 같다.
      </if>
      <if test='num lte 10 '>
      -- num lte 10
      </if>
      </script>
      """)
   List<String> select2(Integer number);


   @Select("""
      <script>      
      SELECT CustomerName, ContactName
      FROM customers
      <if test= 'code == 1'>
      WHERE customerName LIKE #{k}
      </if>
      <if test= 'code == 2'>
      WHERE contactName LIKE #{k}
      </if>
      </script>
      """)
   List<Map<String, Object>> select3(Integer code, String k);

   @Select("""
      <script>
      SELECT COUNT(*)
      FROM customers
      WHERE 
      <if test='i gt 10'>
      -- i가 10보다 큼
      </if>
      <if test='i lt 10'>
      -- i가 10보다 작음
      </if>
      <if test='(i gt 0 and i lt 100)'>
      -- i가 0보다 크고 100보다 작으면
      </if>
      </script>
      """)
   String select4(int i);

   @Select("""
SELECT *
FROM customers
WHERE CustomerName > 'a';
""")
   String select5();

   // CDATA[] : 문자로만 판단, 마크업 표시로 해석하지 말란 구문.
   @Select("""
      <script>
      <![CDATA[
         SELECT *
         FROM customers
         WHERE CustomerName < 'a';
      ]]>
      </script>
      """)
   String select6();

   @Select("""
      <script>
      SELECT *
      FROM customers
      WHERE Country IN 
      <foreach collection="args" 
      item="elem"
      separator=", "
      open="("
      close=")">
      #{elem} 
      </foreach>
      
      </script>
      """)
   String select7(List args);

   @Select("""
      <script>
      SELECT *
      FROM customers

         <trim prefix="WHERE" prefixOverrides="OR">
            <foreach collection="args"
               item="elem">
               OR Country = #{elem}
            </foreach>
         </trim>                  
      </script>
      """)
   String select8(List args);

   @Select("""
      <script>
      <bind name="alterKeyword" value="'%'+keyword+'%'"/>
      SELECT *
      FROM customers
      WHERE CustomerName LIKE #{alterKeyword}
      </script>
      """)
   String select9(String keyword);

   @Select("""
      <script>
      SELECT *
      FROM customers
      WHERE 
      <if test= "word == 'abc'">
      </if>
      <if test= 'word == "abc"'>
      </if>
      <if test= "word == 'q'">
      </if>
      <if test= 'word == "K"'>
      </if>
      </script>
      """)
   String select10(String word);

   @Select("""
      SELECT DISTINCT City
      FROM customers
      WHERE City IS NOT NULL AND city !=''
      ORDER BY 1
      """)
   List<String> listCustomerCity();

   @Select("""
      SELECT DISTINCT Country
      FROM customers
      WHERE Country IS NOT NULL AND Country !=''
      ORDER BY 1
      """)
   List<String > listCustomerCountry();

   @Select("""
      <script>
      SELECT CustomerName name, City, Country
      FROM customers
      <trim prefix="WHERE"> 
         <if test= 'type == "1"'>
            city
            <foreach collection="city" item="elem" open=" IN ( "
                     separator="," close=")">
                     #{elem}
            </foreach>
         </if>
         <if test= 'type == "2"'>
            country
            <foreach collection="country" item="elem" open=" IN ( "
                     separator="," close=")">
                     #{elem}
            </foreach>
         </if>
      </trim>
      ORDER BY name, country, city
      </script>
      """)
   List<Map<String, Object>> listCustomer(MyDto36 dto);







   @Select("""
      SELECT p.ProductID, p.ProductName, p.price, c.CustomerID, c.CustomerName, o.OrderDate
      FROM products p
      JOIN orderdetails ord on p.ProductID = ord.ProductID
      JOIN orders o on ord.OrderID = o.OrderID
      JOIN customers c on o.CustomerID = c.CustomerID
            <trim prefix="WHERE"> 
               <if test= 'type == "1"'>
                  productId
                  <foreach collection="productId" item="elem" open=" IN ( "
                           separator="," close=")">
                           #{elem}
                  </foreach>
               </if>
               <if test= 'type == "2"'>
                  productName
                  <foreach collection="productName" item="elem" open=" IN ( "
                           separator="," close=")">
                           #{elem}
                  </foreach>
               </if>
            </trim>
      """)
   List<Map<String, Object>> listProduct(MyDto100 dto);
   @Select("""
      SELECT DISTINCT productId
      FROM products
      WHERE productId IS NOT NULL AND productId !=''
      ORDER BY 1
     
      """)
   List<String>listProductId();

   @Select("""
      SELECT DISTINCT productName
      FROM products
      WHERE productName IS NOT NULL AND productName !=''
      ORDER BY 1
      """)
   List<String> listProductName();
}

