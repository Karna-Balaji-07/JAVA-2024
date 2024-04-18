/* BankAccount class with methods deposit() and withdraw() */

class BankAccount{
    private String accountNumber;
    private int balance;

    public BankAccount(String accn, int bal){
        this.balance = bal;
        this.accountNumber = accn;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }
    public int getBalance(){
        return balance;
    }
}

class SavingsAccount1 extends BankAccount{
    public SavingsAccount1(int bal, String accn){
        super(accn,bal);
    }
    public void withdraw(int amount){
        if(getBalance() - amount <= 100)
            System.out.println("Minimum balance of 100 is required");
        else
            super.withdraw(amount);
    }
}

public class OOPS_11_Inheritance {
    public static void main(String args[]){
        BankAccount obj1 = new BankAccount("ACCIN723890001",1000000);
        obj1.deposit(1000000);
        obj1.withdraw(2000);
        int balance = obj1.getBalance();
        System.out.println("Balance in the BankAccount : "+balance);

        SavingsAccount1 obj2= new SavingsAccount1(50000, "ACCIN54312001");
        obj2.withdraw(20000);
        int balances = obj2.getBalance();
        System.out.println("Balance in SavingsAccount : "+balances);
    }
}
