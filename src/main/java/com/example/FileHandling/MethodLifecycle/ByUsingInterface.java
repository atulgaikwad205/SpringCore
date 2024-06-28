package com.example.FileHandling.MethodLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByUsingInterface implements InitializingBean , DisposableBean {
    private int price;

    public ByUsingInterface(int price) {
        this.price = price;
    }
    public ByUsingInterface() {
      super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ByUsingInterface{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("in init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy");
    }
}
