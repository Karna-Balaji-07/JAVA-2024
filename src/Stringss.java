public class Stringss {
    public static void main(String args[]) {
        String name = new String("john wick");
        System.out.println("name is : "+name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Excommunicado"));

        String n = "hello";
        String m = "Hello";
        System.out.println(n==m);


        System.out.println();
        System.out.println("String buffer");
        StringBuffer sb = new StringBuffer("navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" reddy");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(0,"java");
        System.out.println(sb);

    }
}
