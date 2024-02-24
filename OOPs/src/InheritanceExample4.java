//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

import java.util.*;
class Employees
{
    private int salary;
    public Employees(int salary)
    {
        this.salary = salary;
    }
    public void work()
    {
        System.out.println("Working as an employww");
    }

    public int getSalary()
    {
        return salary;
    }
}

class HRManager extends Employees
{
    public HRManager(int salary)
    {
        super(salary);
    }

    public void work()
    {
        System.out.println("Managing Employee");
    }
    public void addEmployee()
    {
        System.out.println("Adding new Employee!!");
    }
}
public class InheritanceExample4 {
    public static void main(String args[])
    {
        HRManager hr = new HRManager(1000);
        Employees emp = new Employees(1028923);
        emp.work();
        hr.work();
        System.out.println(emp.getSalary());
        System.out.println(hr.getSalary());
    }
}
