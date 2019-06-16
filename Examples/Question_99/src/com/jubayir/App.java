package com.jubayir;

public class App {

    int count;

    public static void displayMsg() {
        count++;                                                       // line n1
        System.out.println("Welcone " + "Visit Count:" + count);  // line n2
    }

    public static void main(String[] args) {
        App.displayMsg();                      // line n3
        App.displayMsg();                      // line n4
    }
}
