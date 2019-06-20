package com.jubayir;

public class Test {

    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }

}
