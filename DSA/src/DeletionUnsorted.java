public class DeletionUnsorted {

    static int findElement(int arr[], int n, int key)
    {
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    static int deleteElement(int arr[], int n, int key)
    {
        int position = findElement(arr,n,key);
        for(int i= position ; i < n-1 ; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }
    public static void main(String args[])
    {
        System.out.println("Deleting Elements in an array when it is unsorted");
        int i;
        int arr[] = { 10, 50, 30, 40, 20 };
        int n = arr.length;
        int res = deleteElement(arr,n,30);
        for(i=0;i<res;i++)
            System.out.println(arr[i]+" ");

    }
}
