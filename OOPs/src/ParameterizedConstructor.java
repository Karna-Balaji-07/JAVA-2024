import java.util.*;

class  GPA
{
    String name;
    int n;
    double a;

    GPA(String name, int n,double a)
    {
        this.name = name;
        this.n = n;
        this.a = a;
    }

}


public class ParameterizedConstructor {

        public static void main(String args[])
        {
            System.out.println("Parameterizede constructor");
            GPA g = new GPA("John",123,32.123);
            System.out.println(g.name+g.n+g.a);
        }
}
