package com.jubayir;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1 = s3;
        s3 = s2;
        s2 = null;
    }

}
