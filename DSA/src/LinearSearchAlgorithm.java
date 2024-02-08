public class LinearSearchAlgorithm {

    static int LinearSearch(int arr[], int n, int key)
    {
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Linear Search Algorithm");
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int res = LinearSearch(arr,arr.length,x);
        System.out.println(res);
    }
}
