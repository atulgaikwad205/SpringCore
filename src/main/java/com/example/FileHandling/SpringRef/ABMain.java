package com.example.FileHandling.SpringRef;

import com.example.FileHandling.SpringDemo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABMain {

    public static void main (String[]args){
        System.out.println("hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a);
    }
}
