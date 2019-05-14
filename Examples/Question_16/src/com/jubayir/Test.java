package com.jubayir;

public class Test {

    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount(int)(Math.random() * 1000
        );  // line n1
        System.out.println(acct.getAmount());
    }

}
