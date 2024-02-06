import java.util.Scanner;

public class Factorial {
    static int factorial(int n)
    {
        int res = 1;
        for(int i=2;i<=n;i++){
            res *= i;
        }
        return res;
    }

    static int recursive(int n){
        if(n==0)
            return 1;
        return n * recursive(n-1);
    }
    public static void main(String args[]){
        System.out.println("Factorial of a Number");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.println("Factorial of "+a+" : "+factorial(a));
        System.out.println("Factorial using recursive method : "+recursive(a));
    }
}
