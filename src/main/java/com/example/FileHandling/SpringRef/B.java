package com.example.FileHandling.SpringRef;

public class B {
    private int y;

    public B(int y) {
        this.y = y;
    }
    public B(){
        super();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
