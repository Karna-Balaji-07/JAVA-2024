import java.util.*;

public class Inputs {

    public static void  main(String args[])
    {
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    double num2 = input.nextDouble();
    float num3 = input.nextFloat();
    long num4 = input.nextLong();
    byte num5 = input.nextByte();

    System.out.println("Integer : "+num1);
    System.out.println("Double value : "+num2);
    System.out.println("Floating value : "+num3);
    System.out.println("Long integer value : "+num4);
    System.out.println("Byte value : "+num5);

    }
}