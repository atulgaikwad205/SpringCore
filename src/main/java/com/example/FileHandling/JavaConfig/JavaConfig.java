package com.example.FileHandling.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example.FileHandling.JavaConfig")
public class JavaConfig {

    @Bean      //getStudent is default Bean name
    public Student getStudent(){
        Student std = new Student();
        return  std;
    }
    @Bean(name = "bb")   //bb is given Bean name
    public Book getbook(){
        Book bk = new Book("test",getStudent());
        return bk;
    }
}
