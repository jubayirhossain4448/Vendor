package com.jubayir;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        // insert code here
        int f = ps.indexOf(p2);
        if (f >= 0) {
            System.out.println("Mike Found");
        }
    }
    
}
