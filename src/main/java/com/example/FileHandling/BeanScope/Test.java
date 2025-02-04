package com.example.FileHandling.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student std = context.getBean("student",Student.class);
        Student std1 = context.getBean("student",Student.class);
        System.out.println(std.hashCode());
        System.out.println(std1.hashCode());

        Teacher t1 = context.getBean("teacher",Teacher.class);
        System.out.println(t1.hashCode());
        Teacher t2 = context.getBean("teacher",Teacher.class);
        System.out.println(t2.hashCode());
    }

}
