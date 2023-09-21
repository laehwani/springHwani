package com.example.springhwani.domain;

public class Student {

    // email property       (읽기, 쓰기가능)
    // information property (읽기, 쓰기가능)
    private String email;
    private String info;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfomation() {
        return info;
    }

    public void setInfomation(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
            "email='" + email + '\'' +
            ", info='" + info + '\'' +
            '}';
    }
}
