//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
//Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

abstract class Animals1{
    public abstract void eat();
    public abstract void sleep();

}

class Lions extends Animals1{
    public void eat(){
        System.out.println("Lion is eating");
    }
    public void sleep(){
        System.out.println("Lion is sleeping");
    }
}

class Tigers extends Animals1{
    public void eat(){
        System.out.println("Tiger is eating");
    }
    public void sleep(){
        System.out.println("Tiger is sleeping");
    }
}

class Deer extends Animals1{
    public void eat(){
    System.out.println("Deer is eating");
}
    public void sleep(){
        System.out.println("Deer is sleeping");
    }
}

public class Abstract_3{
    public static void main(String args[]){
        Animals1 lion = new Lions();
        Animals1 tiger = new Tigers();
        Animals1 deer =  new Deer();
        lion.eat();
        lion.sleep();
        tiger.eat();
        tiger.sleep();
        deer.eat();
        deer.sleep();

    }
}