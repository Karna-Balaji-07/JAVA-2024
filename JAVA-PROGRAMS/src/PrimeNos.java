import java.awt.desktop.SystemSleepEvent;

public class PrimeNos {

    public static void prime(int n)
    {
        int count;
        boolean flag = false;
        for(int i=2;i<=n;i++)
        {
            count = 0;
            for(int j=1;j<=i;j++)
            {
                if (i % j == 0)
                    count++;
            }
            if(count==2)
                System.out.print(i+" ");
        }
    }

    public static void main(String args[])
    {
        int n = 100;
        prime(n);
    }
}
