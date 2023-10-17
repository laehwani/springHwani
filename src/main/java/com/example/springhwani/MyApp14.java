package com.example.springhwani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp14 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp14.class, args);
        Object bean1 = context.getBean("bean1");
        System.out.println("bean1 = " + bean1);

        Object bean2 = context.getBean("bean2");
        System.out.println("bean2 = " + bean2);

        configuration conf = context.getBean("configuration", configuration.class);
        myClass27 obj1 = conf.bean1();
        myClass27 obj2 = conf.bean2();

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);

        System.out.println(conf.bean1());
        System.out.println(conf.bean2());
        System.out.println(new myClass27());
        System.out.println(new myClass27());

        System.out.println("conf = "+ conf);
    }
}

// spring bean 을 만드는 메소드를 가진 클래스
// Configuration 클래스(bean을 포함했음)
@Configuration
class configuration {

//    bean 을 만드는 메소드
//    bean 의 이름은 메소드명과 같다
    @Bean
    public myClass27 bean1() {
        return new myClass27();
    }
    @Bean
    public myClass27 bean2() {
        return new myClass27();
    }
}

//@Component : bean의 이름이 클래스 이름을 lowerCamelCase 로 바꾼 것
class myClass27 {

}
