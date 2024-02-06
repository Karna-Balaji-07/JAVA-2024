import java.io.*;
import java.util.*;

public class LargestElementInArray {

    int largest1(int arr[], int n)
    {
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    public static void main(String args[]){
        Scanner num = new Scanner(System.in);

        int[] arr =  {10, 324, 45, 90, 9808};
        int n = arr.length;
        LargestElementInArray obj = new LargestElementInArray();
        int res = obj.largest1(arr,n);
        System.out.println(res);

        int arr1[] = { 12, 45, 67, 89, 100, 23,
                3456, 897, 452, 444, 899, 700};
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length-1]);
    }


}
