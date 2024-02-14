public class Stocks {

    public static int Profit(int arr[], int n)
    {
        int mini = 1000;
        int maxi = -1;
        int sub;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < mini)
                mini = arr[i];
            sub = arr[i] - mini;
            if(sub > maxi)
                maxi = sub;
        }
        return maxi;
    }

    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        int res = Profit(arr,n);
        System.out.println(res);
    }
}
