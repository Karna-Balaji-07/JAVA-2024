// Program to implement Hierarchical Inheritance

import java.util.*;
import java.io.*;

class A
{
    public void printA()
    {
        System.out.println("Parent class A");
    }
}

class B extends A
{
    public void printB()
    {
        System.out.println("Derived class B from Class A");
    }
}

class C extends A
{
    public void printC()
    {
        System.out.println("Derived class C from class A");
    }
}

class D extends A{
    public void printD()
    {
        System.out.println("Derived class D from class A");
    }
}

public class HierarchicalInheritance {
    public static void main(String args[])
    {
        B b = new B();
        b.printA();
        b.printB();

        C c = new C();
        c.printA();
        c.printC();

        D d = new D();
        d.printA();
        d.printD();
    }
}
