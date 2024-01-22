public class SwapNumbers {
    public static void main(String args[]){
        System.out.println("Swapping two numbers!!");
        int n = 342;
        int m = 455;

        System.out.println("Approach 1 : using a third variable");
        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println("value of m is : "+m);
        System.out.println("value of n is : "+n);
        System.out.println("value of temp is : "+temp);

    }

}
