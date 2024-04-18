// Animal with a method makeSound

class Animal1{
    public void makeSound(){
        System.out.println("Animal1 makes sound");
    }
}

class Cat1 extends Animal1{
    public void makeSound(){
        System.out.println("Cat make sound");
    }
}

public class OOPS_7_Inheritance {
    public static void main(String args[]){
        Cat1 obj = new Cat1();
        obj.makeSound();
        Animal1 obj1 = new Animal1();
        obj1.makeSound();
    }
}
