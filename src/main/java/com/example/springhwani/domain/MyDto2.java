package com.example.springhwani.domain;

public class MyDto2 {

    // name property (문자열)
    // address property (문자열
    // birthDate property( 문자열)
    // signed property ( 논리형 )

    private String name;
    private String address;
    private String BirthDAte;
    private Boolean signed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDAte() {
        return BirthDAte;
    }

    public void setBirthDAte(String birthDAte) {
        BirthDAte = birthDAte;
    }

    public Boolean getSigned() {
        return signed;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
    }
}
