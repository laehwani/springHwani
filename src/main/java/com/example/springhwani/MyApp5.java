package com.example.springhwani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApp5 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp5.class, args);

        // 우리가 직접 제어하려면
        MyClass8 my8 = new MyClass8();
        MyClass7 my7 = new MyClass7();
        my7.setField1(my8);
    }
}

class MyClass8 {

    public void method8() {
        System.out.println("MyClass8.method8");
    }


}
class MyClass7 {

    public MyClass7() {
        this.field1 = field1;
    }

    public void setField1(MyClass8 field1) {
        this.field1 = field1;
    }

    private MyClass8 field1;
    // MyClass7 은 MyClass8 field1 이 없으면 안된다.
    // 의존하고 있는 이 필드를 dependency (의존성) 이라고 한다.

    public void method7() {
        field1.method8();
    }
}
