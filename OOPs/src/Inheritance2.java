// class Employee : base class
// class engineer : derived class

import java.util.*;
class Employee
{
    int salary = 1000;
}

class Engineer extends Employee
{
    int benefits = 10000;
}
public class Inheritance2 {
    public static void main(String args[])
    {
        Engineer eng =  new Engineer();
        System.out.println("Salary : "+eng.salary);
        System.out.println("Benefits : "+eng.benefits);
    }
}
