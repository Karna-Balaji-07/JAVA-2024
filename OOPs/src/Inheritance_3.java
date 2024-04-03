//Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

import java.util.Scanner;
class Shapes{
    public double getArea(){
        return 0.0;
    }
}

class RectangleArea extends Shapes{
    double length;
    double width;

    public RectangleArea(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
}

public class Inheritance_3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        double w = input.nextDouble();
        Shapes obj = new Shapes();
        RectangleArea objs = new RectangleArea(l,w);
        System.out.println(obj.getArea());
        double result = objs.getArea();
        System.out.println(result);

    }
}
