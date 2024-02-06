public class LeftTrianglePattern {
    public static void LeftPattern(int k)
    {
        int a,b;
        for(a=0;a<k;a++){
            for(b = 2*(k-a);b >=0;b--){
                System.out.print(" ");
            }
            for(b=0;b<=a;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("Left Triangle Star Pattern");
        int k = 5;
        LeftPattern(k);

    }
}
