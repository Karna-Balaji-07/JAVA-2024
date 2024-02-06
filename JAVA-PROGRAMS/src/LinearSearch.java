public class LinearSearch {

   static int Linear(int arr[], int n, int key) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;

        }
       return -1;
    }
    public static void main(String args[]){
        System.out.println("Linear Search");
        int[] arr = {5,2,6,8,4,0,3,7};
        int n = arr.length;
        int k = 3;
        int res = Linear(arr,n,k);
        System.out.println(res);
    }
}
