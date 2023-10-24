package com.example.springhwani.domain;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class MyDto42 {
   private String city;
   private Integer age;
   private Boolean married;
   private String car;
   private Map<String, Object> home;
   private List<String> foods;

}
