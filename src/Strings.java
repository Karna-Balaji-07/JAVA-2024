import java.util.*;
public class Strings {
    public static void main(String args[])
    {
        String name = new String("Jack Sparrow");
        System.out.println(name);

        String name1 = " Wick";
        System.out.println(name1);
        System.out.println(name+" "+name1);

        int len = name.length();
        System.out.println(name.charAt(1));
        System.out.println(name.substring(2));
        System.out.println(name.concat(name1));
        System.out.println(len);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('J','S'));

    }
}
