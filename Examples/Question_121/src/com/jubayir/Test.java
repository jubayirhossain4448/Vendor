package com.jubayir;

import java.time.LocalDate;
import java.time.Month;

public class Test {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
        System.out.println(date);
    }

}
