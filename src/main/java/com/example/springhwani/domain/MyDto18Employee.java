package com.example.springhwani.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MyDto18Employee {
    private Integer id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String photo;
    private String notes;
}
