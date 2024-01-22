import java.util.Scanner;
public class UserInput {
    public static void main(String args[]){
        System.out.println("Taking input from the user! ");

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        System.out.println("You have entered string : "+str);

        int num = input.nextInt();
        System.out.println("You have entered intger : "+num);

        float f = input.nextFloat();
        System.out.println("You have entered floating number : "+f);




    }
}
