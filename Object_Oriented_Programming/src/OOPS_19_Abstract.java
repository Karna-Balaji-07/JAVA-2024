/* Abstract Employee class with manager and programmer as subclasses
 */

abstract class Employee3{
    protected String name;
    protected int salary;

    public Employee3(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String names){
        this.name = names;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public abstract int newSalary();
    public abstract void info();

}
class Manager2 extends Employee3{
    private int bonus;
    public Manager2(String name,int salary, int bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public int newSalary() {
        return salary + bonus  ;
    }

    @Override
    public void info() {
        System.out.println("Manager Name : "+name );
        System.out.println("Base salary : "+salary);
        System.out.println("Total salary after bonus : "+newSalary());
    }
}

class Programmer1 extends Employee3{
    int bonus;
    public Programmer1(String name, int salary, int bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public int newSalary() {
        return salary+bonus;
    }

    @Override
    public void info() {
        System.out.println("Programmer name : "+name);
        System.out.println("Base salary : "+salary);
        System.out.println("New Salary after bonus : "+newSalary());
    }
}
public class OOPS_19_Abstract {
    public static void main(String args[]){
        Manager2 obj1 = new Manager2("John",1000000,50000);
        Programmer1 obj2 = new Programmer1("Mark",250000,25000);
        obj1.info();
        obj2.info();
        obj1.setName("Halo");
        obj2.setName("Kings");
        obj1.setSalary(23459005);
        obj2.setSalary(431344321);
        obj1.info();
        obj2.info();
    }
}
