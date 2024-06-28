package com.example.FileHandling.AutowiringByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp =(Employee) context.getBean("employee");
        System.out.println(emp);
    }
}
