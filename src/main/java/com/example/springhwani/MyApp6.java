package com.example.springhwani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp6 {

    public static void main(String[] args) {
        // Inversion Of Control (I.O.C)
        // 그래서 스프링을 IOC 컨테이너 라고도 한다.
        ApplicationContext context = SpringApplication.run(MyApp6.class, args);

        MyClass9 myClass9 = context.getBean("myClass9", MyClass9.class);
        myClass9.method9();

        System.out.println("myClass9.getField1() = "+ myClass9.getField1());
        context.getBean("myClass10");

    }
}
@Component // myClass10 빈
class MyClass10 {

    void method10() {
        System.out.println("MyClass10.method10");
    }

}
@Component // myClass9 빈
class MyClass9 {

    @Autowired
    // set 메서드에 값을 넣어달라는 어노테이션 autowired
    // 이런의미에서 의존성 주입(dependency injection) 이라고 한다.
    // 줄여서 d.i
    public void setField1(MyClass10 field1) {
        this.field1 = field1;
    }

    public MyClass9(MyClass10 field1) {
        this.field1 = field1;
    }

    private MyClass10 field1;

    // 클래스9 는 클래스 10을 dependency 하고있다.
    public void method9() {
        field1.method10();
    }

    public MyClass10 getField1() {
        return field1;
    }
}
