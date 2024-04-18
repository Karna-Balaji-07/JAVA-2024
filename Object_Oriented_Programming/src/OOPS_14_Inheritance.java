/* Vehicle class hierarchy */
// Using Abstract classes and methods also

abstract class Vehicle2{
    private String model;
    private String name;
    private int fuel;
    private int year;

    public Vehicle2(String models, String names, int fuels, int years){
        this.model = models;
        this.fuel = fuels;
        this.name = names;
        this.year = years;
    }

    public String getModel(){
        return model;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getFuel(){
        return fuel;
    }
    public abstract double efficieny();
    public abstract double totalYears();
    public abstract int totalSpeed();

}

class Car2 extends Vehicle2{
    public Car2(String models, String names, int fuels, int years){
        super(models, names, fuels, years);
    }

    @Override
    public double efficieny() {
        return 1245.312;
    }
    @Override
    public double totalYears(){
        return 5;
    }
    @Override
    public int totalSpeed(){
        return 120;
    }
}
class Truck1 extends Vehicle2{
    public Truck1(String models, String names, int fuels, int years){
        super(models, names, fuels, years);
    }

    @Override
    public double efficieny() {
        return 124.2;
    }
    @Override
    public double totalYears(){
        return 1;
    }
    @Override
    public int totalSpeed(){
        return 70;
    }
}



public class OOPS_14_Inheritance {
    public static void main(String args[]){
        Car2 obj1 = new Car2("Eicher2007","EicherTurbo",5000,20);
        Truck1 obj2 = new Truck1("Suzuki","Swift",1200,40);
        System.out.println(obj1.efficieny());
        System.out.println(obj1.totalSpeed());
        System.out.println(obj2.efficieny());
        System.out.println(obj2.totalSpeed());
        System.out.println(obj1.totalYears());
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj1.getFuel());
    }
}
