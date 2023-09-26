package com.example.springhwani.domain;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class MyDto11 {

    private String userId;
    private String userEmail;
    private LocalDate birthDate;
    private List<String> hobby;


}
