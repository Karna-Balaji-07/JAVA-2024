import java.util.*;

class Stacks
{
    int size = 10000;
    int top = -1;
    int arr[] = new int[size];

    void push(int x)
    {
        top++;
        arr[top] = x;
    }

    int pop()
    {
        int x  = arr[top];
        top--;
        return x;
    }

    int Top()
    {
        return arr[top];
    }

    int Size()
    {
        return top+1;
    }
}
public class StacksinArray {

    public static void main(String args[])
    {
        Stacks s = new Stacks();
        s.push(17);
        s.push(16);
        s.push(15);
        s.push(14);
        s.push(13);
        s.push(12);
        s.push(11);
        System.out.println("Size of the stack : "+ s.Size());
        System.out.println("The top element of the stack : "+s.Top());
        System.out.println("Popped element : "+s.pop() );
        System.out.println("Size of the stack : "+ s.Size());
    }


}
