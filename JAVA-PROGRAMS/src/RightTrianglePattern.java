public class RightTrianglePattern {
    public static void main(String args[])
    {
        System.out.println("Right Triangle Star Pattern");
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        int k = 5;
        int i = 1;
        String num = " * ";
        while(i<=k){
            System.out.println(num);
            num += " * ";
            i++;
        }

    }
}
