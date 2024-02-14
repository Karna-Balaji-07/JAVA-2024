public class Sort012 {

    public  void sortArray(int arr[], int n)
    {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1)
                c1++;
            else if(arr[i] == 2)
                c2++;
            else
                c0++;
        }

        for(int i=0;i<c0;i++)
            arr[i] = 0;
        for(int i=c0;i<c0+c1;i++)
            arr[i] = 1;
        for(int i=c0+c1;i<n;i++)
            arr[i] = 2;
    }

    public void print(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        System.out.println("Sort an Arrat of 0 , 1 , 2");
        int[] arr = {0,2,1,2,1,0,1};
        int n = arr.length;
        Sort012 obj = new Sort012();
        obj.sortArray(arr,n);
        obj.print(arr,n);
    }
}
