public class Stringbuffer {
    public static void main(String args[])
    {
        StringBuffer n = new StringBuffer("hello");
        n.append(" To The Hello World World");
        int a = n.length();
        System.out.println(n);
        System.out.println(a);
        System.out.println(n.capacity());
        System.out.println(n.insert(5," How are yoo"));
        System.out.println(n.replace(0,5,"Goodbye"));
        System.out.println(n.delete(0,8));
        System.out.println(n.deleteCharAt(1));
        System.out.println(n.reverse());

    }
}
