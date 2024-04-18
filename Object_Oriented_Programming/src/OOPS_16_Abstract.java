/* Abstract Shape class with circle and triangle subclass */

import java.util.Scanner;
abstract class Shape3{
    public abstract double Area();
    public abstract double Perimeter();
}

class Circle2 extends Shape3{
    private double radius;
    public Circle2(double radius){
        this.radius = radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }
    public double Perimeter(){
        return Math.PI * 2 * radius;
    }
}

class Triangle1 extends Shape3{
    private double side1;
    private double side2;
    private double side3;

    public Triangle1(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public double Area(){
        double s = (side1 + side3 + side2) / 2;
        return Math.sqrt(s*(s-side1) * (s-side2) * (s-side3));
    }
    public double Perimeter(){
        return side2 + side3 + side1;
    }
}

public class OOPS_16_Abstract {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Circle2 obj1 = new Circle2(input.nextDouble());
        Triangle1 obj2 = new Triangle1(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Area of Circle : "+obj1.Area());
        System.out.println("Perimeter of circle : "+obj1.Perimeter());
        System.out.println("Area of triangle : "+obj2.Area());
        System.out.println("Perimeter of triangle : "+obj2.Perimeter());
    }
}
