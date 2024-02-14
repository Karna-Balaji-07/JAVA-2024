import java.util.Arrays;

public class SearchArray {

    public int search(int arr[], int n, int k)
    {
        int low = 0;
        int high = n-1;
        while(high >= low)
        {
            int mid = (high+low)/2;
            if(arr[mid] == k )
                return mid;
            if(arr[mid] > k)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String args[])
    {

        System.out.println("To check if the value is present in the array");
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};
        int key = 9;
        SearchArray obj = new SearchArray();
        int res = obj.search(arr,arr.length,key);
        if(res < 0)
            System.out.println("Error");
        else
            System.out.println("Contact");

        Arrays.sort(arr);
        int ress = Arrays.binarySearch(arr,key);
        System.out.println(ress);
    }
}
