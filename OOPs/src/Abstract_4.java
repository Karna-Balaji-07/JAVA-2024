//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
//Create subclasses Manager and Programmer that extend the Employee class
//implement the respective methods to calculate salary and display information for each role.

import java.util.Scanner;
abstract  class Employ{
    String name;
    int baseSalary;
    public Employ(String name, int base){
        this.name = name;
        this.baseSalary = base;
    }

    public abstract int calculateSalary();
    public abstract void displayInfo();

}

class Manager extends Employ{
    int bonus;
    public Manager(String name, int salary, int bonus){
        super(name,salary);
        this.bonus = bonus;
    }
    public int calculateSalary(){
        return baseSalary + bonus;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total salary: "+calculateSalary());
    }
}

class Programmer extends Employ{
    int overtime;
    int hourlyRate;
    public Programmer(String name, int salary, int overtime, int hourlyrate){
        super(name,salary);
        this.overtime = overtime;
        this.hourlyRate = hourlyrate;
    }
    public int calculateSalary(){
        return baseSalary + (overtime * hourlyRate);
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Bonus : "+ (overtime * hourlyRate));
        System.out.println("Total salary: "+calculateSalary());
    }

}
public class Abstract_4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int bsalary = input.nextInt();
        int bonus = input.nextInt();
        int overtime = input.nextInt();
        int hourlyRate = input.nextInt();
        Employ manager = new Manager(name,bsalary,bonus);
        Employ programmer = new Programmer(name,bsalary,overtime,hourlyRate);
        manager.calculateSalary();
        programmer.calculateSalary();
        manager.displayInfo();
        programmer.displayInfo();
    }
}
