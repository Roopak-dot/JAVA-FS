package com.tka.may28n1;

interface Vehicle {
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped");
    }

    // Static method
    static void service() {
        System.out.println("Vehicle needs servicing");
    }
}
