package com.example.FileHandling.MethodLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String [] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Test t = (Test) context.getBean("m1");
//        System.out.println(t);
       context.registerShutdownHook();
//
//        ByUsingInterface byt = (ByUsingInterface) context.getBean("m2");
//        System.out.println(byt);

        ByUsingAnnotation bya = (ByUsingAnnotation) context.getBean("m3");
        System.out.println(bya);
    }
}
