//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

import java.util.*;

class Shape
{
    public int getArea()
    {
        return 0;
    }
}

class Rectangle extends Shape
{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea()
    {
        return length * breadth;
    }
}
public class InheritanceExample3 {
    public static void main(String args[])
    {
        Rectangle rectangle = new Rectangle(45,68);
        int area = rectangle.getArea();
        System.out.println("Area of rectangle : "+area);
    }
}
