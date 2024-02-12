import java.util.*;

class Node1
{
    int value;
    Node1 next;
}

public class InsertAfterLL {
    Node1 head;

    void push(int data)
    {
        Node1 n = new Node1();
        n.value = data;
        n.next = head;
        head = n;
    }

    void insertAfter(Node1 prev, int data)
    {
        if(prev == null)
        {
            System.out.println("Previous cannot be NULL");
            return;
        }
        Node1 n = new Node1();
        n.value = data;
        n.next = prev.next;
        prev.next = n;
    }

    void traverse()
    {
        Node1 temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        InsertAfterLL node = new InsertAfterLL();
        node.push(1);
        node.push(2);
        node.push(3);
        node.push(4);
        node.push(5);
        node.push(6);
        node.traverse();
        node.insertAfter(node.head, 0);
        node.traverse();
    }

}
