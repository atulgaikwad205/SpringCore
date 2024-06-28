package com.example.FileHandling.StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      //  Student std = context.getBean("studnet",Student.class);
        Student std = context.getBean("ob",Student.class);
        System.out.println(std);
    }
}
