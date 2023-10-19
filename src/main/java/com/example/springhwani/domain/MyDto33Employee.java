package com.example.springhwani.domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class MyDto33Employee {

   private Integer id;
   private String lastName;
   private String firstName;
   private String photo;
   private String notes;
   private LocalDate birthDate;

}
