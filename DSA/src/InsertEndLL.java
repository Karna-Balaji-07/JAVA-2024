import java.util.*;

class Node2
{
    int value;
    Node2 next;
}


public class InsertEndLL {
    Node2 head;

    void push(int data)
    {
        Node2 n = new Node2();
        n.value = data;
        n.next = head;
        head = n;
    }

    void traverse()
    {
        Node2 temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void insertEnd(int data)
    {
        Node2 n = new Node2();
        n.value = data;
        if(head==null)
        {
            head = n;
            return;
        }
        Node2 last = head;
        while(last.next != null)
            last = last.next;

        last.next = n;
    }

        public static void main(String args[])
        {
            InsertEndLL node = new InsertEndLL();
            node.push(1);
            node.push(2);
            node.push(3);
            node.push(4);
            node.push(5);
            node.traverse();
            node.insertEnd(01);
            node.traverse();

        }

}
