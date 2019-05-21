package com.jubayir;

public class Vowel {

    private char var;

    public static void main(String[] args) {
        String var1 = "a";
        String var2 = var1;
        var2 = "e";

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }

}
