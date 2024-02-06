public class Arrays1 {
    public static void main(String args[]) {
        System.out.println("Arrays");

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
       };
        for(int i=0;i< array.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

//        int[][] array = {
//                {1, 2, 3,4},
//                {5, 6,7,8},
//                { 9,10,11,12},
//                {13,14,15,16}
//        };

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if(i==0 || i == array.length-1 || j==0 || j == array[i].length-1)
//                System.out.print(array[i][j] + " ");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();

//        for (int j = 0; j < array[0].length; j++) {
//            System.out.print(array[0][j] + " ");
//        }
//        System.out.println();
//        int last = array.length - 1;
//        for (int j = 0; j < array[last].length; j++) {
//            System.out.print(array[last][j] + " ");
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        double [] num = new double[]{1.1,2.2,3.3,4.4,5.5};
//        double sum = 0;
//        for(int i=0;i<5;i++){
//            sum += num[i];
//        }
//        System.out.println(sum);
//
//
//
//        String [] names = new String[]{"Ankit","Piyush","Yaswnath","Jasveer","Dhruv"};
//        int [] roll = new int[]{1,2,3,4,5};
//        for(int i=0;i<5;i++){
//            if(roll[i] %2 != 0){
//                System.out.println("Name : "+names[i]+"  Roll no : "+roll[i]);
//            }
//        }
//        for(int i=0;i<5;i++){
//            System.out.println(names[i]);
//        }
//        System.out.println("End");

//        int array[] = new int[10];
//
//        // array literal in Java :
//        int [] newarray = new int[]{1,2,3,4,5,6,7,8,9};
//        for(int i=0;i<9;i++){
//            System.out.println("Array element "+i+" = "+newarray[i]);
//        }
//        System.out.println("End");
//
//        int [] arr1 = new int[5];
//        System.out.println(arr1.length);

        }
    }

