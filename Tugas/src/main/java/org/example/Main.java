package org.example;

import org.example.classes.ATM;
import org.example.classes.Human;

public class Main {
    public static void main(String args[]){
        //House
        ATM atm1 = new ATM("12345","54321");
        Human human1 = new Human("Budi Rayenza", 30000, atm1);
        human1.deposit(1000);
        human1.withdraw(500);
        human1.printWealth();
    }
}