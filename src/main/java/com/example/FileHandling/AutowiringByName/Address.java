package com.example.FileHandling.AutowiringByName;

public class Address {
    private String road;
    private  String city;

    public Address() {
        super();
    }

    public Address(String road, String city) {
        this.road = road;
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "road='" + road + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
