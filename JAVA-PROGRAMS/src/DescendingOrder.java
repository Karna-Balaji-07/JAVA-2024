import java.util.*;
public class DescendingOrder {

    public static void reverse(int arr[], int n)
    {
        int temp;
        for(int i=0;i<n/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[n-i-1];  //Swapping the first half of the array
            arr[n-i-1] = temp;  // Swapping the last half of the array
        }
    }

    public static void main(String args[])
    {
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};
        int n = arr.length;
        Arrays.sort(arr);
        reverse(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }



}
