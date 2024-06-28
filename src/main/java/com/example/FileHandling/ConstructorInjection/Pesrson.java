package com.example.FileHandling.ConstructorInjection;

public class Pesrson {
    private String name;
    private int id;
    private Ct c;

    public Pesrson(String name, int id,Ct c) {
        this.name = name;
        this.id = id;
        this.c=c;
    }

    @Override
    public String toString() {
        return "Pesrson{" +
                "name='" + this.name + '\'' +
                ", id=" + this.id + '\'' +
                ",ctName="+this.c.name+
                '}';
    }
}
