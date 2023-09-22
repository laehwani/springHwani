package com.example.springhwani.domain;

public class MyDto7 {

        public String getName() {
            return "한여름";
        }

        @Override
        public String toString() {
            return "내가 만든 클래😎😎";

    }

    private String address;
    private String email;
    private Integer age;

    public String getAddress() {
        return "서울😎😎";
    }

    public String getEmail() {
        return "ab@gmail.com";
    }

    public Integer getAge() {
        return 33;
    }
}
