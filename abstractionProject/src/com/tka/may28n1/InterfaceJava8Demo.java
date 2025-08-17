package com.tka.may28n1;

public class InterfaceJava8Demo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();           // default method
        Vehicle.service();  // static method
    }
}
