package com.example.FileHandling.ConstructorInjection;

import com.example.FileHandling.SpringRef.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main (String[]args){
        System.out.println("hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Pesrson p = (Pesrson) context.getBean("person");
        System.out.println(p);
        Addition add = (Addition)  context.getBean("add");
        add.duSum();

    }
}
