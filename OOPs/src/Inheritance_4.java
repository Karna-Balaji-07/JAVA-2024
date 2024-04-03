//Write a Java program to create a class called Employee with methods called work() and getSalary().
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

import java.util.Scanner;

class Emp{
    int salary;
    public Emp(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Employee is working");
    }
    public int getSalary(){
        return salary;
    }
}

class HR extends Emp{
    public HR(int salary) {
        super(salary);
    }

    public void work(){
        System.out.println("HR manager is working");
    }

    public void AddEmp(){
        System.out.println("Adding new Employee");
    }

}
public class Inheritance_4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        Emp obj = new Emp(salary);
        HR objs = new HR(salary);
        obj.work();
        System.out.println(obj.getSalary());
        objs.work();
        objs.AddEmp();
    }
}
