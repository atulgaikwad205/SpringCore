package com.example.FileHandling.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args){
        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        Friends friend = (Friends) context.getBean("friendsname");
        System.out.println(friend);
        System.out.println("=============");
        Friends fnd = (Friends) context.getBean("feesDetails");
        System.out.println(fnd);
        System.out.println("=============");
        Friends fd =(Friends) context.getBean("cities");
        System.out.println(fd);
    }
}
