public class MajorityElement {

    public static int majority(int arr[])
    {
        int n = arr.length;
        int count = 0;
        int element = 0;

        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count = 1;
                element=arr[i];
            }
            else if(arr[i] == element)
                count++;
            else
                count--;
        }

        int count1 = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == element)
                count1++;
        }
        if(count1 > (n/2))
            return element;
        return -1;
    }

    public static void main(String args[])
    {
        System.out.println("The Majority element > n/2");
        int arr[] = {2,2,1,1,1,2,2};
        int res = majority(arr);
        System.out.println("The majority element : "+res);
    }


}
