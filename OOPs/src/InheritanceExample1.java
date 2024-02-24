//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

import java.util.*;

class Animal
{
    public void makeSound()
    {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal
{
    public void makeSound()
    {
        System.out.println("Cat makes sound");
    }
}
public class InheritanceExample1 {
    public static void main(String args[])
    {
        Cat cat = new Cat();
        cat.makeSound();
        cat.makeSound();
    }
}


