//Write a Java program to create an abstract class Animal with an abstract method called sound().
//Create subclasses Lion and Tiger that extend the Animal class and
// implement the sound() method to make a specific sound for each animal.

import java.util.Scanner;

abstract class Animal1{
    public abstract void sound();

}

class Lion extends Animal1{
    public void sound(){
        System.out.println("Lion roaring");
    }
}

class Tiger extends Animal1{
    public void sound(){
        System.out.println("Tiger Roaring");
    }
}
public class Abstract_1 {
    public static void main(String args[]){
        Animal1 lion = new Lion();
        lion.sound();
        Animal1 tiger = new Tiger();
        tiger.sound();
    }
}
