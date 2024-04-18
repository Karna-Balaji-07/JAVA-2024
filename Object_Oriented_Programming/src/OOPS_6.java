//      Inheritance

class Employee{
    int salary = 1000;
}

class engineer extends Employee{
    int age = 42;
}
public class OOPS_6 {
    public static void main(String args[]){
        engineer obj = new engineer();
        System.out.println("Age of the employee : "+obj.age);
        System.out.println("Salary of the employee : "+obj.salary);
    }
}
