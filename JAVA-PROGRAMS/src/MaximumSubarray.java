import java.util.*;

public class MaximumSubarray {

    public static int subarray(int arr[], int n)
    {
        int maxi = -1;
        int sum;
        for(int i=0;i<n;i++)
        {
            sum = 0;
            for(int j=i;j<n;j++)
            {
                sum+= arr[j];
                maxi = Integer.max(sum,maxi);
            }

        }
        return maxi;
    }

    public static int subArray(int arr[], int n)
    {
        int max = -1;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0;

        }
        return max;
    }
    public static void main(String args[])
    {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int res = subarray(arr,n);
        int result = subArray(arr,n);
        System.out.println(res);
        System.out.println(result);
    }


}
