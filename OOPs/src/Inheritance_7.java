//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea()
//Create a subclass called Circle that overrides the getPerimeter() and
// getArea() methods to calculate the area and perimeter of a circle.

import java.util.Scanner;
import java.util.*;

class Shape1{
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}

class Circle extends Shape1{
    double radius;
    public Circle(double r){
        this.radius = r;
    }
    public double getPerimeter(){
        return (Math.PI * 2 * radius);
    }
    public double getArea(){
        return (Math.PI * radius * radius);
    }
}

public class Inheritance_7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        Shape1 ob = new Shape1();
        Circle obj = new Circle(radius);
        System.out.printf("Perimeter: %.2f\n", obj.getPerimeter());
        System.out.printf("Area: %.2f\n", obj.getArea());
    }
}
