package com.example.FileHandling.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cc")
public class City {

    @Value("Pune") //simple value
    private String cityname;
    @Value("#{11+33}") //expression value
    private int code;

    @Value("#{ T(java.lang.Math).sqrt(144) }")  //static method called in value
    private double x;

    @Value("#{ T(java.lang.Math).PI }") //variable called in value
    private double y;

    @Value("#{ new String('TestName') }") //object  called in value
    private String name;

    @Value("#{ 8>3 }")   //boolean called in value
    private boolean isActive;

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityname='" + cityname + '\'' +
                ", code=" + code +
                ", x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
