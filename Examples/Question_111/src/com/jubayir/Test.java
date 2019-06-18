package com.jubayir;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        LocalDate Time dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt format(DateTimeFormatter.ISO_DATE));
    }
    
}
