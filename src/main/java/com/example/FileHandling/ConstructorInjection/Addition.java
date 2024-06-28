package com.example.FileHandling.ConstructorInjection;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        //System.out.println("this in int");
    }

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("this in double");
    }

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("this in String");
    }
    public void duSum(){
        System.out.println("a : "+this.a);
        System.out.println("b : "+this.b);
        System.out.println(this.a+this.b);
    }
}
