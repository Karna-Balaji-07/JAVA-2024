import java.util.*;

class Node
{
    int value;
    Node next;
}


public class InsertAtFrontLL {
    Node head;

    void insertAtFront(int data)
    {
        Node n = new Node();
        n.value = data;
        n.next = head;
        head = n;
    }

    void traverse()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static  void main(String args[])
    {
        System.out.println("Insertion at the Front of Linked List");
        InsertAtFrontLL node = new InsertAtFrontLL();
        node.insertAtFront(1);
        node.insertAtFront(2);
        node.insertAtFront(3);
        node.insertAtFront(4);
        node.insertAtFront(5);
        node.traverse();
    }



}
