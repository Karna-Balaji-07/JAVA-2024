public class Conditionals {
    public static void main(String args[]){
        System.out.println("Conditionals !!");

        int a = 10;
        int b = 50;
        int c = 300;
        int d = 43;
        if(a>b && b<c)
            System.out.println("Test1");
        else if (a>d || b<d) {
            System.out.println("Test2");
        }
        else if(a!=b && b>=c)
            System.out.println("Test3");
        else
            System.out.println("Test4 : Failure");


    int i = 9;
        switch (i){
            case 1:
                System.out.println("Test1");
                break;
            case 2:
                System.out.println("Test2");
                break;
            case 3:
                System.out.println("Test3");
                break;
            case 4:
                System.out.println("Test4");
                break;
            case 5:
                System.out.println("Test5");
                break;
            default:
                System.out.println("Test case Failure!!");
        }







    }
}
