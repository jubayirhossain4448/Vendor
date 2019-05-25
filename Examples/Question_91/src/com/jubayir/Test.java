package com.jubayir;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);
        e3.printDetails();
    }

}
