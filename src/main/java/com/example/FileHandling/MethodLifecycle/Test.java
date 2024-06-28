package com.example.FileHandling.MethodLifecycle;

public class Test {
    private int price;

    public Test(int price) {
        this.price = price;
    }
    public Test() {
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("2nd - Setting value");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Test{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("1st - Initialing");
    }
    public void destroy(){
        System.out.println("3st - cleanig objects");
    }
}
