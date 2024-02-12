import java.util.*;

public class ParameterizedConstructor {

    String name;
    int id;
    double gpa;
    ParameterizedConstructor(String name, int id, double gpa)
    {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public static void main(String args[])
    {
        ParameterizedConstructor obj = new ParameterizedConstructor("Arjun",1221394,8.4);
        System.out.println("Name : "+obj.name);
        System.out.println("ID : "+obj.id);
        System.out.println("GPA : "+obj.gpa);
    }
}
