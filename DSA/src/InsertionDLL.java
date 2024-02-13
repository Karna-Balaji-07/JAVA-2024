class Node6
{
    int value;
    Node6 next;
    Node6 prev;
}

public class InsertionDLL {
    Node6 head;

    public void push(int data)
    {
        Node6 n = new Node6();
        n.value = data;
        n.next = head;
        n.prev = null;
        if(head != null)
            head.prev = n;
        head = n;
    }

    public void insertAfter(Node6 prev, int data)
    {
        Node6 node = new Node6();
        node.value = data;
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if(node.next != null)
            node.next.prev = node;

    }

    void traverse()
    {
        Node6 temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        InsertionDLL node = new InsertionDLL();
        node.push(1);
        node.push(12);
        node.push(13);
        node.push(14);
        node.push(15);
        node.traverse();
        node.insertAfter(node.head.next.next,10);
        node.traverse();


    }
}
