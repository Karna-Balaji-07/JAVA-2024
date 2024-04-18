/* Implement Animal interface with method bark() */

interface Animal4{
    void bark();
}

class Dog1 implements Animal4{
    public void bark(){
        System.out.println("Dogs bark");
    }
}

public class OOPS_21_Interface {
    public static void main(String args[]){
        Dog1 obj1 = new Dog1();
        obj1.bark();
    }
}
