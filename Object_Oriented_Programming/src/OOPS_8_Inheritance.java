/* Create a class called Vehicle with a method called drive();
 Create a subclass class called car that overrides the method drive() to print car is driving
*/

class Vehicle1{
    public void drive(){
        System.out.println("Vehicle is driving");
    }
}

class Car1 extends Vehicle1{
    public void  drive(){
        System.out.println("Car is driving");
    }
}
public class OOPS_8_Inheritance {
    public static void main(String args[]){
        Car1 obj = new Car1();
        obj.drive();
        Vehicle1 obj1 = new Vehicle1();
        obj1.drive();
    }
}
