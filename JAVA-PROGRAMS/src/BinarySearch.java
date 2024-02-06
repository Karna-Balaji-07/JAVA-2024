public class BinarySearch {

     int binary(int arr[], int low, int high, int key)
    {

        while(high>=low){
            int mid = (high + low)/2;

            if(arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                high = mid-1;

            else
                low = mid+1;
            }
        return  -1;

    }

    int binarysearch(int arr[], int low, int high, int key)
    {
        if(high >= low){
            int mid = (high+low)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]<key)
                return binarysearch(arr,mid+1,high,key);
            return binarysearch(arr,low,mid-1,key);
        }
        return -1;
    }

    public static void main(String args[]){
        BinarySearch obj = new BinarySearch();

        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int res = obj.binary(arr,0,n-1,x);
        if(res==-1)
            System.out.println("Not Found");
        else
            System.out.println("Found");

        int result = obj.binarysearch(arr,0,n-1,1);
        if(result==-1)
            System.out.println("Negative");
        else
            System.out.println("Affirmative");
    }
}
