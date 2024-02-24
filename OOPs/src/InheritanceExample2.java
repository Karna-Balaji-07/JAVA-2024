//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

import java.util.*;

class Vehicle
{
    public void drive()
    {
        System.out.println("Vehicle class : Drive method");
    }
}

class Car extends Vehicle
{
    public void drive()
    {
        System.out.println("Car class : Repairing a car");
    }
}

public class InheritanceExample2 {
    public static void main(String args[])
    {
        Car car = new Car();
        car.drive();
    }
}
