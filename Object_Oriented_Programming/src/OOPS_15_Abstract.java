/* Abstract Animal class with Lion and tiger subclasses */

abstract class Animal2{
    public abstract void makeSound();
}

class Lion1 extends Animal2{
    public void makeSound(){
        System.out.println("Lion makes sound");
    }
}

class Tiger1 extends Animal2{
    public void makeSound(){
        System.out.println("Tiger makes sound");
    }
}
public class OOPS_15_Abstract {
    public static void main(String args[]){
        Lion1 obj1 = new Lion1();
        Tiger1 obj2 = new Tiger1();
        obj1.makeSound();
        obj2.makeSound();
    }
}
