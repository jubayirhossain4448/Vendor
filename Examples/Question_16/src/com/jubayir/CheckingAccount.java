package com.jubayir;

public class CheckingAccount {
    public int amount;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    
    public void changeAmount(int x){
    
        amount += x;
    }
}
