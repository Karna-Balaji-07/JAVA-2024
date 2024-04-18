/* Shape with getArea() method and implement the shape in interface */

interface Shape4{
    double getArea();
}

class Rectangl2 implements Shape4{
    private int length;
    private int breadth;

    public Rectangl2(int l,int b){
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double getArea() {
        return length*breadth;
    }
}

class Circle3 implements Shape4{
    private double radius;
    public Circle3(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle2  implements Shape4{
    double side1;
    double side2;
    double side3;

    public Triangle2(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    @Override
    public double getArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}

public class OOPS_20_Interface {
    public static void main(String args[]){
        Circle3 obj1 = new Circle3(3.14);
        Rectangl2 obj2 = new Rectangl2(31,423);
        Triangle2 obj3 = new Triangle2(23.3,43.5,66.6);
        System.out.println("Area of circle : "+obj1.getArea());
        System.out.println("Area of rectangle : "+obj2.getArea());
        System.out.println("Area of Triangle : "+obj3.getArea());
    }
}
