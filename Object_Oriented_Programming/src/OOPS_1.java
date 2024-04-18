// INITIALIZING A JAVA OBJECT

import java.util.Scanner;
class Dog{

    // instance variables
    String name;
    String breed;
    int age;
    String color;

    // Constructor declaration of the class
    public Dog(String name, int age, String breed, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String getName(){return name;}
    public int getAge() { return age; }
    public String getColor() { return color; }
    public String getBreed() { return breed; }

    public String toString(){
        return ("Hi the dogs name is "+ this.getName() + " and he is "+ getAge()+ " and he is of this color and breed "+ getBreed() + " " + getColor());

    }


}
public class OOPS_1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String name = input.next();
        String breed = input.next();
        String color = input.next();

        Dog obj = new Dog(name, age, breed, color);
        String colors = obj.getColor();
        String names = obj.getName();
        String breeds = obj.getBreed();
        System.out.println(obj.toString());
        System.out.println(colors);
        System.out.println(names);
        System.out.println(breeds);
    }
}
