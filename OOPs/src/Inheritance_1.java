//write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.

import java.util.*;

class Animals{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animals{
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
public class Inheritance_1 {
    public static void main(String args[]){
        Animals obj = new Animals();
        obj.makeSound();
        Dog objs = new Dog();
        objs.makeSound();
    }
}
