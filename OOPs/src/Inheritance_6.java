//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
//Create a subclass called Employee that adds a new method named getEmployeeId()
//overrides the getLastName() method to include the employee's job title.

import java.util.Scanner;

class Person{
    String fname;
    String lname;

    public Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    public String getFirstName(){
        return fname;
    }
    public String getLastName(){
        return lname;
    }
}

class Empl extends Person{
    String EmpID;
    String Title;

    public Empl(String fname, String lname, String EmpID, String Title){
        super(fname,lname);
        this.EmpID = EmpID;
        this.Title = Title;
    }

    public String getEmpID(){
        return EmpID;
    }
    public String getLastName(){
        return Title;
    }

}

public class Inheritance_6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String fname = input.next();
        String lname = input.next();
        String EmpID = input.next();
        String Title = input.next();
        Person obj = new Person(fname, lname);
        Empl objs = new Empl(fname,lname,EmpID,Title);
        System.out.print(obj.getFirstName()+" ");
        System.out.println(obj.getLastName());
        System.out.println(objs.getEmpID());
        System.out.println(objs.getLastName());
    }
}
