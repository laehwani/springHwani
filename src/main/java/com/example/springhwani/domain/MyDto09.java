package com.example.springhwani.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyDto09 {

    private String name;
    private Integer id;
    private String foods;
    private String cars;

    public MyDto09(String name) {

    }
}
