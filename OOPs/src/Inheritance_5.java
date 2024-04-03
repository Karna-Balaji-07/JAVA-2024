//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
//    if the account balance falls below one hundred.

import java.util.Scanner;

class BankAccount{
    int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }
    }
    public int getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(int balance){
        super(balance);
    }
    public void withdraw(int amount){
        if(getBalance() < 100)
            System.out.println("Minimum balance is required");
        else
            super.withdraw(amount);
    }
}


public class Inheritance_5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int bal = input.nextInt();
        BankAccount obj = new BankAccount(bal);
        SavingsAccount objs = new SavingsAccount(bal);
        obj.deposit(10000);
        obj.withdraw(2000);
        System.out.println(obj.getBalance());
        objs.withdraw(100);


    }
}
