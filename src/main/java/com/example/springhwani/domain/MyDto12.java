package com.example.springhwani.domain;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class MyDto12 {

    private Integer id;
    private String name;
    private String address;
    private LocalDateTime schedule;
    private List<String> foods;

}
