public class BinarySearchAlgorithm {

    static int BinaryIterative(int arr[],int key)
    {
        int low = 0;
        int high = arr.length -1;
        while(low <= high)
        {
            int mid = (high+low)/2;
            if(arr[mid]==key)
                return mid;
            if (arr[mid] < key)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }

    int BinaryRecursive(int arr[], int low, int high,int key)
    {
        if(high >= low)
        {
            int mid = (high+low)/2;
            if(arr[mid]==key)
                return mid;

            if(arr[mid] > key)
                return BinaryRecursive(arr,low,mid-1,key);
            return BinaryRecursive(arr,mid+1,high,key);
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Binary Search Algorithm");
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int res = BinaryIterative(arr,x);
        System.out.println(res);

        BinarySearchAlgorithm obj = new BinarySearchAlgorithm();
        int result = obj.BinaryRecursive(arr,0,n-1,x);
        System.out.println(result);

    }
}
