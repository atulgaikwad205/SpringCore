package com.example.FileHandling.AutowiringByAnnotation;

public class Company {
    private String name;
    private int id;

    public Company() {
        super();
    }

    public Company(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
