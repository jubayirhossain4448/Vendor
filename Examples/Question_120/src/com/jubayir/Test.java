package com.jubayir;

public class Test {
    int wd = 0;
    String days[] = ("Sun", "mon", "wed", "sat");
    for(String s : days){
switch (s){
    case "sat";
    case "sun";
    wd -= 1;
    break;
    case "mon";
    wd++;
    case "wed";
    wd +- 2;
}
}
    System.out.println(wd);
    
}
