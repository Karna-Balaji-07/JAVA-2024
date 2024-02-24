class Calculator
{
    int a;
    public Calculator(int a)
    {
        this.a = 0;
    }
    public void area()
    {
        int area = a*a;
        System.out.println("Area : "+area);
    }
    public void perimeter(int b)
    {
        int perimeter = 4*b;
        System.out.println("Perimeter : "+perimeter);
    }
}

public class AnonymousObj {
    public static void main(String args[])
    {
        System.out.println("Anonymous Objects");
        new Calculator(100).area();

    }
}
