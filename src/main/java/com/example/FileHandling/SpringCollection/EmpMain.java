package com.example.FileHandling.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

    public static void main (String[]args){
        System.out.println("hello2");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp emp = (Emp) context.getBean("studentCollection");
        System.out.println(emp);
    }
}
