public class Palindrome {

    public static void palindrome(String s)
    {
        StringBuffer S = new StringBuffer(s);
        StringBuffer a = S.reverse();
        if(a == S)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static boolean palindrome1(String s)
    {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String args[])
    {
        String s = new String("John Wick");
        palindrome(s);
        String a = "1212";

        System.out.println(palindrome1(a));
    }
}
