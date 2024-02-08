public class BubbleSort {

    static void bubble(int arr[], int n)
    {
        int i,j,temp;
        boolean flag;
        for(i = 0 ; i < n ; i++){
            flag = false;
            for(j = 0 ; j < n-1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }
            if(flag==false)
                break;
        }
    }

    static void print(int arr[], int n)
    {
        int i;
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        System.out.println("Bubble Sort Algorithm");
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubble(arr, n);
        System.out.println("Sorted array: ");
        print(arr, n);
    }
}
