////Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
//Create subclasses Circle and Triangle that extend the Shape class
//implement the respective methods to calculate the area and perimeter of each shape.

import java.util.Scanner;

abstract class Shaped{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circles extends Shaped{
    double radius;
    public Circles(double r){
        this.radius = r;
    }
    public double calculateArea(){
        return (Math.PI * radius * radius);
    }

    public double calculatePerimeter(){
        return (Math.PI * 2 * radius);
    }
}

class Triangle extends Shaped{
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double calculateArea(){
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter(){
        return (side1 + side2 + side3);
    }
}
public class Abstract_2 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        double r = inp.nextDouble();
        Shaped circle =  new Circles(r);
        double s1 = inp.nextDouble();
        double s2 = inp.nextDouble();
        double s3 = inp.nextDouble();
        Shaped triangle = new Triangle(s1,s2,s3);
        double area = circle.calculateArea();
        double per = circle.calculatePerimeter();
        double art = triangle.calculateArea();
        double pert = triangle.calculatePerimeter();
        System.out.println(area);
        System.out.println(per);
        System.out.println(art);
        System.out.println(pert);
    }
}
