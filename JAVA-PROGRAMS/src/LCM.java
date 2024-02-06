import java.io.*;
import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
        System.out.println("LCM of two numbers");
        Scanner  num = new Scanner(System.in);

        int a = num.nextInt();
        int b = num.nextInt();

        int ans = (a > b) ? a : b;
        while(true){
            if(ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of "+a+" and "+ b +" is : "+ans);
    }
}
