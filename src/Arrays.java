public class Arrays {
    public static void main(String args[]){
        int num[] = {1,2,3,4,6,8};
        System.out.println(num[1]);
        num[1] = 10;
        System.out.println(num[1]);

        int nums[] = new int[4];
        System.out.println(nums[0]);
        nums[0] = 109;
        nums[1] = 12;
        nums[2] = 14;
        nums[3] = 11;

        for(int i=0;i<=3;i++){
            System.out.println(nums[i]);
        }
        System.out.println();




        int n[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                n[i][j] = (int)(Math.random()*10);   // using math module
                System.out.println(n[i][j]);
            }

        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int k[] : n){
            for( int l : k){
                System.out.print(l+" ");
            }
            System.out.println();
        }




    }
}
