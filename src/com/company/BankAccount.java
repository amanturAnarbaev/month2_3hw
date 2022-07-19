package com.company;

public class BankAccount {
    private double amount;



    public double getAmount() {
        System.out.println(amount);
        return amount;
    }
    public double deposit(double sum){
        amount=amount+sum;
        return sum;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum>amount) {
            throw new LimitException("please enter correct amount. your amount is "+ amount);
        }
        amount=amount-sum;
    }

}

