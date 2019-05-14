package com.jubayir;

public class Test {

    int x = 5;

    while (isAvailable(x) 
        ){
            System.out.println(x);
    }

    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }

}
