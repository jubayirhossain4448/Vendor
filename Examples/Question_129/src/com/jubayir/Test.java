package com.jubayir;

public class Test {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;
        while (x > 0) {
            System.out.println(array[--x]);
        }
    }

}
