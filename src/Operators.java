public class Operators {
    public static void main(String args[]){
        System.out.println(" Operators!!");

        System.out.println("Arithmetic Operators : !!");
        int num1 =103;
        int num2 = 432;
        int addition = num1+num2;
        int difference = num2 - num1;
        int product = num1 * 342;
        int modulus = num2 % 2;

        num1++;
        ++num1;
        num2--;
        --num2;


        System.out.println(" ");
        System.out.println(" RELATIONAL OPERATOR!!");
        boolean res1 = num1 > num2;
        boolean res2 = num1 < num2;
        boolean res3 = num1 >= num2;
        boolean res4 = num1 <= num2;
        boolean res5 = num1 == num2;
        boolean res6 = num1 != num2;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(" ");


        System.out.println(" LOGICAL OPERATORS");
        int a = 10;
        int b = 20;
        int c = 30;
        boolean r1 = a > b && c < b;
        boolean r2 = a < b && c > b;
        boolean r3 = a > b || c < b;
        boolean r4 = a > b || c > b;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
