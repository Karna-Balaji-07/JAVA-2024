
class Node4
{
    int value;
    Node4 next;
}
public class LengthOfLL {

    Node4 head;
    public void push(int data)
    {
        Node4 n = new Node4();
        n.value = data;
        n.next = head;
        head = n;
    }

    public void traverse()
    {
        Node4 temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void length()
    {
        Node4 curr = head;
        int count =0;
        while(curr != null)
        {
            count++;
            curr = curr.next;
        }
        System.out.println("Length of the linked list : "+count);
    }

    public static void main(String args[])
    {
        LengthOfLL node  = new LengthOfLL();
        node.push(12);
        node.push(32);
        node.push(62);
        node.push(18);
        node.push(2);
        node.push(122);
        node.traverse();
        node.length();

    }

}
