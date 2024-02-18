package org.example.classes;

import java.util.Scanner;

public class ATM {
    private String cardNumber;
    private String password;
    private int amount;

    public ATM(String cardNumber, String password){
        this.cardNumber = cardNumber;
        this.password = password;
        this.amount = 0;
    }

    protected String getCardNumber(){
        return this.cardNumber;
    }

    protected String getPassword(){
        return this.password;
    }

    public void withdraw(String cardNumber, String password, int amount){
        if ((cardNumber.compareTo(this.cardNumber) == 0)&&(password.compareTo(this.password) == 0)){
            if (amount <= this.amount){
                this.amount = this.amount - amount;
                System.out.println("Withdraw successful");
            }else {
                System.out.println("Not enough balance");
            }
        }else {
            System.out.println("Wrong card number or pin");
        }
    }

    public void deposit(String cardNumber, String password, int amount){
        if ((cardNumber.compareTo(this.cardNumber) == 0)&&(password.compareTo(this.password) == 0)){
            this.amount = this.amount + amount;
            System.out.println("Deposit successful");
        }else {
            System.out.println("Wrong card number or pin");
        }
    }

    public int getBalance(){
        return this.amount;
    }

    public void printBalance(){
        System.out.println("You currently have "+this.amount+" in your bank account");
    }
}
