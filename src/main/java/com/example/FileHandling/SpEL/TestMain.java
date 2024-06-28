package com.example.FileHandling.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        City c1 = context.getBean("cc",City.class);
        System.out.println(c1);
    }
}
