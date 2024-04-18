/* Employee class with methods called work and getSalary*/

class Employee1{
    private int salary;

    public Employee1(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Employee working ");
    }
    public int getSalary(){
        return salary;
    }
}

class Manager1 extends Employee1{
    public Manager1(int salary){
        super(salary);
    }
    public void work(){
        System.out.println("Manager is working");
    }

}

public class OOPS_10_Inheritance {
    public static void main(String args[]){
        Manager1 obj1 = new Manager1(530900);
        obj1.work();
        System.out.println("Salary of Manager = "+obj1.getSalary());
        Employee1 obj2 = new Employee1(74278);
        obj2.work();
        System.out.println("Salary of employee = "+obj2.getSalary());
    }
}
