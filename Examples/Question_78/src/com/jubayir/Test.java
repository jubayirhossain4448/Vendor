package com.jubayir;

public class Test {

    public static void main(String[] args) {
        try {
            int num = 10;
            int div = 0;
            int ans = nim / div;
        } catch (Exception e) {
            ans = 0;          // line n1
        } catch (Exception e) {
            System.out.println("Invalid Calculation");
        }
        System.out.println("Answer = " + ans);    // line n2
    }
}
