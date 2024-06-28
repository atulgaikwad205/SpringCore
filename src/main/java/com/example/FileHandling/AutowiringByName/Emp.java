package com.example.FileHandling.AutowiringByName;

import org.springframework.context.support.AbstractApplicationContext;

public class Emp {
    private Address address;


    public Emp(Address address){
        this.address=address;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
