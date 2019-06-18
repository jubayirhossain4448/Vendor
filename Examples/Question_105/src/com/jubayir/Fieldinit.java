package com.jubayir;

public class Fieldinit {
    char c;
    boolean b;
    float f;
    void printAll(){
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }
    
    public static void main(String[] args) {
        Fieldinit f = new Fieldinit();
        f.printAll();
    }
    
}
