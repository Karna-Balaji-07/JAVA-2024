public class InsertionSort {

    void isnertion(int arr[])
    {
        int n = arr.length;
        for(int i = 1 ;i < n ; i++){
            int j = i-1;
            int key = arr[i];

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void print(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        System.out.println("Insertion Sorting Algorithm");
        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort obj = new InsertionSort();
        obj.isnertion(arr);
        print(arr);

    }
}
