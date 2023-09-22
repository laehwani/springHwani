package com.example.springhwani.domain;

import lombok.Data;

@Data
public class MyDto8 {
    private String food;
    private String Computer;
    private String BirthDate;

    public void setFood(String food) {
        this.food = food;
    }

    public void setComputer(String computer) {
        Computer = computer;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }
}
