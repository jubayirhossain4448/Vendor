package com.jubayir;

public class Employee {

    String name;
    boolean contract;
    double salary;

    Employee() {

        // line n1
//        this.name = "Md. Jubayir Hossain";
//        this.contract = true;
//        this.salary = 100000;
    }

    public String toString() {

        return name + ": " + contract + ": " + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // line n2
//        e.name = "Md. Jubayir Hossain";
//        e.contract = true;
//        e.salary = 100000;
        System.out.println(e);
    }
}
