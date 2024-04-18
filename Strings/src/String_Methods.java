import java.util.Scanner;
public class String_Methods {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String file = input.nextLine();
        System.out.println("Length of the string: "+name.length());
        System.out.println("Character at 4th index : "+name.charAt(4));
        System.out.println("Substring starting from 1 to 5: "+name.substring(1,5));
        System.out.println("Index of the specified world : "+name.indexOf('f'));
        System.out.println("equals case: "+name.equals(file));
        System.out.println("Equals ignore clase: "+name.equalsIgnoreCase(file));
        System.out.println("Upper case: "+name.toUpperCase());
        System.out.println("Lower case: "+file.toLowerCase());
        System.out.println("Replace f with g: "+name.replace('f','g'));
    }
}
