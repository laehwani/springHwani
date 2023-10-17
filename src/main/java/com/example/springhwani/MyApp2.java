package com.example.springhwani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp2 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp2.class, args);
        Object bean1 = context.getBean("MyInstance2");
        System.out.println(bean1 instanceof MyClass2); // true
        MyClass2 o1 = (MyClass2) bean1;
        o1.method2();

        Object bean3 = context.getBean("MyBean3");
        System.out.println(bean3 instanceof MyClass3); // true
        MyClass3 o3 = (MyClass3) bean3;

        System.out.println(System.identityHashCode(context.getBean("MyBean3")));
        System.out.println(System.identityHashCode(context.getBean("MyBean3")));
        System.out.println(System.identityHashCode(context.getBean("MyBean3")));

        MyClass2 bean22 = context.getBean("MyInstance2", MyClass2.class);
        MyClass3 bean33 = context.getBean("MyBean3", MyClass3.class);

    }

}

@Component("MyBean3")
class MyClass3 {

}

@Component("MyInstance2")
class MyClass2 {

    public void method2() {
        System.out.println("MyClass2.method2");
    }
}
