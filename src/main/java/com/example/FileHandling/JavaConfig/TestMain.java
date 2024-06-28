package com.example.FileHandling.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String [] args){
        ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
        Book b = context.getBean("bb",Book.class);
        System.out.println(b);
        b.readName();
        b.getStudent().write();
    }
}
