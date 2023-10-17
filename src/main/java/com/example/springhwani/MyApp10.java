package com.example.springhwani;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MyApp10 {

}

interface myInterface1 {

}

@Component
class myClass18 implements myInterface1{

}
@Component
class myClass19 implements myInterface1 {

}
@Component
//@RequiredArgsConstructor
// myinterface1 을 상속하는 클래스가 2개이기에 사용자가 직접 정해줘야한다.
class MyClass17 {

    private final myInterface1 field;

    public MyClass17(@Qualifier("myClass18")myInterface1 field) {
        this.field = field;
    }

}
