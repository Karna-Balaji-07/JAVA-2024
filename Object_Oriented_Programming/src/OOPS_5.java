
//      Inheritance

class Bicycle{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void Brake(int decrement){
        speed -= decrement;
    }
    public void Gas(int increment){
        speed += increment;
    }
    public String toString(){
        return ("No of gears in the bike is "+ gear+" and the speed of cycle is "+ speed);
    }
}

class Bike extends Bicycle{
    public int seatHeight;
    public Bike(int speed, int gear, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int value){
        seatHeight = value;
    }
    public String toString(){
        return (super.toString() + "\nThe height of the Bike is "+seatHeight);

    }
}

public class OOPS_5 {
    public static void main(String args[]){
        Bike obj = new Bike(5,40,25);
        System.out.println(obj.toString());
    }
}
