//Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car"

class Vehicles{
    public void drive(){
        System.out.println("Vehicle is driving");
    }
}

class Cars extends Vehicles{
    public void drive(){
        System.out.println("Repairing car");
    }
}

public class Inheritance_2 {
    public static void main(String args[]){
        Vehicles obj = new Vehicles();
        Cars objs = new Cars();
        obj.drive();
        objs.drive();
    }
}



