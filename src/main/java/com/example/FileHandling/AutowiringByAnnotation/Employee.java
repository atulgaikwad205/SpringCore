package com.example.FileHandling.AutowiringByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    private Company company;


    public Employee() {
        super();
    }
   // @Autowired
    public Employee(Company company) {
        System.out.println("in constructor");
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

   // @Autowired
    public void setCompany(Company company) {
        System.out.println("in setter");
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company=" + company +
                '}';
    }
}
