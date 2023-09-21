package com.example.springhwani.domain;

public class Person {

    private String name;
    private Integer age;
    private String address;
    // name property    (읽기, 쓰기가능)
    // age property     (읽기, 쓰기가능)
    // address property (읽기, 쓰기가능)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }
}
