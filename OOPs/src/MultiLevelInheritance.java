// Program for MultiLevel Inheritance

class One1
{
    public void printOne()
    {
        System.out.println("Class One : Parent Class");
    }
}

class Two2 extends One1{
    public void printTwo()
    {
        System.out.println("Class Two : Derived class from Parent class One ");
        System.out.println("Class Two : Parent class for class Three");
    }
}

class Three extends Two2
{
    public void printThree()
    {
        System.out.println("Class Three : Derived class from parent class Two");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[])
    {
        Three three = new Three();
        three.printOne();
        three.printTwo();
        three.printThree();
    }
}
