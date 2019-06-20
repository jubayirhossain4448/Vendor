package com.jubayir;

public class Test {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x + ":" + y);
    }

}
