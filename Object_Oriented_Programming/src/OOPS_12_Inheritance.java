/* Person class with methods called getFirstName() and getLastName() */

class Person1{
    private String fname;
    private String lname;

    public Person1(String fnames, String lnames){
        this.fname = fnames;
        this.lname = lnames;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
}

class Employee2 extends  Person1{
    private String EmployeeID;
    private String JobTitle;

    public Employee2(String fnames, String lnames, String EmpID, String title){
        super(fnames, lnames);
        this.EmployeeID = EmpID;
        this.JobTitle = title;
    }

    public String getEmpID(){
        return EmployeeID;
    }
    public String getLname(){
        return JobTitle;
    }
}

public class OOPS_12_Inheritance {
    public static void main(String args[]){
        Person1 obj1 = new Person1("John", "Wick");
        Employee2 obj2 = new Employee2("Jack","Sparrow","Carribean Pirate","Captian");
        String fname = obj1.getFname();
        String lname = obj1.getLname();
        System.out.println(fname+" "+lname);
        System.out.println(obj2.getEmpID()+" "+obj2.getLname()+ " "+ obj2.getFname());
    }
}
