import java.util.HashSet;
import java.util.Iterator;




public class Hello {
    public static void main(String args[]){
        HashSet<Integer> set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(9);
        set2.add(8);
        set2.add(7);

        set1.retainAll(set2);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
        System.out.println("hello world");
        System.out.println("Welcome to the world of JAVA!");
        System.out.print(" Thiswesome jobs!1!");
    }
}
