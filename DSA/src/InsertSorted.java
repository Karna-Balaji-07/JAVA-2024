import java.util.*;

public class InsertSorted {

    static int insertAtSorted(int arr[], int n, int capacity, int key)
    {
        if(n >= capacity)
            return n;
        int i;
        for(i=n-1; (i>=0 && arr[i]>key);i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = key;
        return n+1;
    }
    public static void main(String args[]){
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 36;
        int n = 6;
        int i, key = 26;
        i = insertAtSorted(arr,n,capacity,key);
        for(int k = 0;k<i;k++){
            System.out.println(arr[k]+" ");
        }

    }
}
