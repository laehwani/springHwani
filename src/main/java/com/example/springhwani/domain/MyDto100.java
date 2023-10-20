package com.example.springhwani.domain;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class MyDto100 {

   private Integer id;
   private String type;
   private List<String> productId;
//   private List<String> productName;
   private Integer customerId;
   private String price;
   private String customerName;
   private LocalDate orderDate;


}
