package com.example.FileHandling.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestMain {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the JdbcTemplate bean from the context
        JdbcTemplate jdbcTemplate = context.getBean("temp", JdbcTemplate.class);

        System.out.println("Program Started...");

        // Define SQL query for insertion
        String query = "insert into student (id, name, city) values (?, ?, ?)";

        // Execute the insert operation using JdbcTemplate
        jdbcTemplate.update(query, 102, "Ayush", "UP");

        System.out.println("Data Inserted...");
    }
}
