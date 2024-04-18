/* Implement the flyable interface */

interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Spacecraft flies in the space");
    }
}

class Flight implements  Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Flights flie high in the sky");
    }
}

class Helicopter implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Helicopter flies in the sky");
    }
}

public class OOPS_22_Interface {
    public static void main(String args[]){
        Spacecraft obj1 = new Spacecraft();
        Flight obj2 = new Flight();
        Helicopter obj3 = new Helicopter();
        obj1.fly_obj();
        obj2.fly_obj();
        obj3.fly_obj();
    }
}


