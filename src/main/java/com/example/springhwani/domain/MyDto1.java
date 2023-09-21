package com.example.springhwani.domain;

import org.apache.tomcat.util.net.IPv6Utils;

public class MyDto1 {

    // property 명 : get/ set 없애고 대문자로 시작.
    // "name" property 가 만들어졌다
    private String name;
    private String homeAddress;
    private String MyHome;
    private Boolean married;


    public Boolean Married() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getMyHome() {
        return MyHome;
    }

    public void setMyHome(String myHome) {
        MyHome = myHome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
