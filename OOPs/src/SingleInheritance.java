// Program for Single Inheritance
import java.util.*;
import java.io.*;

class One
{
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Two extends One{
    public void print_for()
    {
        System.out.println("Coder007");
    }
}
public class SingleInheritance {
    public static void main(String args[])
    {
        Two two = new Two();
        two.print_geek();
        two.print_for();
    }
}
