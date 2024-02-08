public class DeletionSorted {

    static int findElements(int arr[],int low, int high, int key)
    {
        if(high >= low)
        {
            int mid = (high+low)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid] > key)
                return findElements(arr,low, mid-1,key);
            return findElements(arr,mid+1,high,key);
        }
        return -1;
    }

    static int deleteElement(int arr[], int n, int key)
    {
        int pos = findElements(arr,0,n-1,key);
        for(int i=pos;i<n-1;i++)
            arr[i] = arr[i+1];
        return n-1;
    }
    public static void main(String args[])
    {
        System.out.println("Deleting elements in sorted array");
        int i;
        int arr[] = { 10, 20, 30, 40, 50 };

        int n = arr.length;
        int key = 30;
        int res = deleteElement(arr,n,key);
        for(i=0;i<res;i++)
            System.out.println(arr[i]+" ");
    }
}
