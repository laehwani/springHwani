package com.example.springhwani.domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class MyDto23 {

   private String id;
   private LocalDate 날짜;
   private String 상품;
   private String 카테고리;
   private Integer 수량;
   private String 가격;

}
