/* Create a class called Shape with methods called getPerimeter() and getArea() */

import java.util.Scanner;
class Shape2{
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
}

class Circle1 extends Shape2{
    private double radius;

    public Circle1(double r){
        this.radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
}

public class OOPS_13_Inheritance {
    public static void main(String args[]){
        Scanner input =  new Scanner(System.in);
        double radius = input.nextDouble();
        Circle1 obj = new Circle1(radius);
        System.out.println("Area of the circle : "+obj.getArea());
        System.out.println("Perimeter of the circle : "+obj.getPerimeter());
    }
}
