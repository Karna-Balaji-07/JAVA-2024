import java.util.*;

class Node3
{
    Node3 next;
    int value;
}

public class IterativeSearchLL {

   Node3 head;
    public void push(int data)
    {
        Node3 n = new Node3();
        n.value = data;
        n.next = head;
        head = n;
    }

    public void traverse()
    {
        Node3 temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    boolean search(int key)
    {
        Node3 curr = head;
        while(curr != null)
        {
            if(curr.value == key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public static void main(String args[])
    {
        IterativeSearchLL node = new  IterativeSearchLL();
        int key = 21;
        node.push(3);
        node.push(34);
        node.push(21);
        node.push(13);
        node.push(38);
        node.traverse();
        boolean searchs = node.search(key);
        System.out.println(searchs);


    }

}
