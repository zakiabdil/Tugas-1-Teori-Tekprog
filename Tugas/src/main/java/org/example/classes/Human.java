package org.example.classes;

public class Human {
    private String name;
    private int wallet;
    private ATM atm;
    
    public Human(String name, int wallet, ATM atm){
        this.name = name;
        this.wallet = wallet;
        this.atm = atm;
    }

    public void info(){
        System.out.println("Name : "+this.name+"\nBalance : "+this.wallet);
    }

    public void deposit(int amount){
        if (amount<=this.wallet){
            this.wallet = this.wallet-amount;
            this.atm.deposit(atm.getCardNumber(), atm.getPassword(), amount);
        }else {
            System.out.println("you don't have enough money in your wallet");
        }
    }

    public void withdraw(int amount){
        if (amount<=this.atm.getBalance()){
            this.wallet = this.wallet+amount;
            this.atm.withdraw(atm.getCardNumber(), atm.getPassword(), amount);
        }else {
            System.out.println("you don't have enough money in your bank account");
        }
    }

    public void printWealth(){
        System.out.println(this.name+" has "+this.wallet+" in his wallet and "+this.atm.getBalance()+" in his bank account");
    }
}
