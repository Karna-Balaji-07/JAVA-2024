/* Sortable interface with bubblesort and selection sort implementations */

interface Sortable{
    void sort(int[] arr);
}

class SelectionSort implements Sortable{
    public void sort(int[] arr){
        int i, j, min_index;
        int n = arr.length;
        for(i=0;i<n-1;i++){
            min_index = i;
            for(j=i+1;j<n;j++){
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}

class BubbleSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int i, j;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}

public class OOPS_24_Interface {
    public static void main(String args[]){
        int arr[] = {5,4,8,1,9,3,2,6};
        BubbleSort obj1 = new BubbleSort();
        SelectionSort obj2 = new SelectionSort();
//        obj1.sort(arr);
        obj2.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
