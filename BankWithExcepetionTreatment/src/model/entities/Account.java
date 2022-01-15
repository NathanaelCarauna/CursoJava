package model.entities;

import model.exceptions.InvalidValueParameterException;

public class Account {
    int number;
    String holder;
    double balance;
    double withdrawLimit;

    /**
     * @param number
     * @param holder
     * @param balance
     * @param withdrawLimit
     */
    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) throws InvalidValueParameterException {
        if(amount < 0){
            throw new InvalidValueParameterException("Deposit value can't be negative values");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InvalidValueParameterException{
        if(amount > this.balance){
            throw new InvalidValueParameterException("Withdraw error: There isn't enough balance for withdraw");
        }
        if(amount > this.withdrawLimit){
            throw new InvalidValueParameterException("Withdraw error: The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

}