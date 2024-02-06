import java.util.Scanner;

public class HCF {

    static int GCD(int x, int y){
        if(y==0)
            return x;
        return GCD(y,x%y);
    }

    public static void main(String args[]){
        System.out.println("HCF of two numbers");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is : "+GCD(a,b));


    }
}
