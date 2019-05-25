package com.jubayir;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        setName(name)
        setAge(age)
        setSalary(2000);
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(name + " : " + age + " : " + salary);
    }
}
