package com.jubayir;

public class Car extends Vehicle{
    String trans;

    public Car(String type, int maxSpeed) {
        super(type, maxSpeed);
    }
    
    public Car(String trans, String type, int maxSpeed) {
        super(type, maxSpeed);
        this.trans = trans;
    }   
}
