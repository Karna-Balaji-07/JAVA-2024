/* Abstract Animal class with Lion, Tiger, Deer subclasses */

abstract class Animal3{
    public abstract void eat();
    public abstract void sleep();
}

class Lion2 extends Animal3{
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }
    @Override
    public void sleep(){
        System.out.println("Lion sleeps");
    }
}

class Tiger2 extends Animal3{
    @Override
    public void eat() {
        System.out.println("Tiger eats");
    }
    @Override
    public void sleep(){
        System.out.println("Tiger sleeps");
    }
}

class Deer1 extends Animal3{
    @Override
    public void eat() {
        System.out.println("Deer eats");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps");
    }
}

public class OOPS_18_Abstract {
    public static void main(String args[]){
        Lion2 obj1 = new Lion2();
        Tiger2 obj2 = new Tiger2();
        Deer1 obj3 = new Deer1();
        obj1.eat();
        obj1.sleep();
        obj2.eat();
        obj2.sleep();
        obj3.eat();
        obj3.sleep();
    }
}
