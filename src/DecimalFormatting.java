import java.util.*;
public class DecimalFormatting {
    public static void main(String args[])
    {
        double num1 = 124.54325;
        double num2 = 10.000;
        float num3 = 123.4321f;

        String name = "Jack";

        System.out.printf("%f\n",num1);
        System.out.printf("%.3f\n",num1);
        System.out.printf("%f\n",num2);
        System.out.printf("%.2f\n",num2);
        System.out.printf("%s\n",name);
        System.out.printf("%S\n",name);
    }


}
