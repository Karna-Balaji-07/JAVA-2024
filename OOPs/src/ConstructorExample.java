public class ConstructorExample {

    private String color;
    private String model;
    private int year;
    private boolean status;

    public ConstructorExample(String color, String model, int year)
    {
        this.model = model;
        this.color = color;
        this.year = year;
        this.status = false;
    }

    public String getColor()
    {
        return color;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return  year;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void rentCar()
    {
        status = true;
    }

    public void display()
    {
        System.out.println("Car Model: "+model);
        System.out.println("Car Color: "+color);
        System.out.println("Car Year: "+year);
        System.out.println("Rental Status: "+ (status ? "Rented" : "Unavailable"));

    }

    public static void main(String args[])
    {
        System.out.println("Car Rental System");
        ConstructorExample obj1 = new ConstructorExample("Red","125AJK",2001);
        ConstructorExample obj2 = new ConstructorExample("Blue","456FRT0",1990);
        ConstructorExample obj3 = new ConstructorExample("Black","AK47",2025);
        System.out.println("Car 1 : ");
        obj1.display();
        System.out.println("Car 2 : ");
        obj2.display();
        System.out.println("Car 3: ");
        obj3.display();
        obj1.rentCar();
        obj2.rentCar();
        obj3.rentCar();
        System.out.println("Car 1 : ");
        obj1.display();
        System.out.println("Car 2 : ");
        obj2.display();
        System.out.println("Car 3: ");
    }

}
