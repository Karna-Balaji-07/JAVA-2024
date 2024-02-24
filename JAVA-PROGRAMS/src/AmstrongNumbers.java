public class AmstrongNumbers {

    public static void amstrong(int n,int m)
    {
        int sum=0;
        for(int i=n;i<m;i++)
        {
            int temp = i;
            while (temp > 0)

            {temp %= 10;
            int res = temp*temp*temp;
            sum+= res;}
            if(sum == i)
                System.out.println(i);
        }

    }
    public static void main(String args[])
    {
        System.out.println("Amstrong Numbers between two numbers");
        int n = 100;
        int m = 200;
        amstrong(n,m);

    }
}
