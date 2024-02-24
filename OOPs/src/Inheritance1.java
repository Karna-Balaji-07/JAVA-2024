// Program to implement inheritance in Java
// class Cycle : Baseclass
// class Bike : derived class
// class Test is a driver class to run the program

class Cycle
{
    public int gear;
    public int speed;

    public Cycle(int gear, int speed)
    {
        this.speed = speed;
        this.gear = gear;
    }

    public void brake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString()
    {
        return ("No. of gears are "+gear+"\n"+"Speed of Cycle : "+speed);
    }
}

class Bike extends Cycle
{
    public int seatHeight;

    public Bike(int gear, int speed,int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int value)
    {
        seatHeight = value;
    }

    public String toString()
    {
        return (super.toString()+"\nSeat Height is : "+seatHeight);
    }
}


public class Inheritance1 {
    public static void main(String args[])
    {
        Bike bike = new Bike(3,100,25);
        System.out.println(bike.toString());
    }

}
