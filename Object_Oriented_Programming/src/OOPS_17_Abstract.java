/* Abstract BankAccount class with Savings and CurrentAccounts as subclass */

abstract class BankAccount1{
    private String AccountNumber;
    private int balance;

    public BankAccount1(String accn, int bal){
        this.AccountNumber = accn;
        this.balance = bal;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public  int getBalance(){
        return balance;
    }
    public void setBalance(int bal){
        this.balance = bal;
    }
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
}

class SavingsAccount2 extends BankAccount1{
    public SavingsAccount2(String accn, int bal){
        super(accn,bal);
    }
    public void deposit(int amount){
        setBalance(getBalance()+amount);
    }
    public void withdraw(int amount){
        if(getBalance() >= amount)
            setBalance(getBalance()-amount);
        else
            System.out.println("Insufficient funds");
    }
}

class CurrentAccount1 extends BankAccount1{
    public CurrentAccount1(String accn, int bal){
        super(accn, bal);
    }
    public void deposit(int amount){
        setBalance(getBalance()+amount);
    }
    public void withdraw(int amount){
        if(getBalance() >= amount)
            setBalance(getBalance()-amount);
        else
            System.out.println("Insufficient funds in current savings");
    }
}

public class OOPS_17_Abstract {
    public static void main(String args[]){
        SavingsAccount2 obj1 = new SavingsAccount2("ACCIN12001",10000);
        CurrentAccount1 obj2 = new CurrentAccount1("ACCIN54001",50000);
        System.out.println("Current Balance in SavingsAccount : "+obj1.getBalance());
        System.out.println("Current Balance in CurrentAccount : "+obj2.getBalance());
        obj1.deposit(10000);
        obj2.deposit(10000);
        obj1.withdraw(2999);
        obj2.withdraw(4999);
        System.out.println("Current Balance in SavingsAccount : "+obj1.getBalance());
        System.out.println("Current Balance in CurrentAccount : "+obj2.getBalance());

    }
}
