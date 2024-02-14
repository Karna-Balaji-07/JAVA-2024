import java.util.*;

public class MergeArrays {

    public static void merge(int arr1[], int arr2[])
    {
        int a = arr1.length;
        int b = arr2.length;
        int c= a+b;
        int arr3[] = new int[c];
        for(int i=0;i<a;i++)
            arr3[i] = arr1[i];
        for(int i=0;i<b;i++)
            arr3[i+a] = arr2[i];
        for(int i=0;i<c;i++)
            System.out.print(arr3[i]+" ");
    }

    public static void main(String args[])
    {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int a = arr1.length;
        int b = arr2.length;
        int c1 = a+b;
        int c[] = new int[c1];
        System.arraycopy(arr1,0,c,0,a);
        System.arraycopy(arr2,0,c,a,b);
        System.out.println(Arrays.toString(c));
        merge(arr1,arr2);

    }

}
