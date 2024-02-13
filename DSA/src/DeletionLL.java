class Node5
{
    int value;
    Node5 next;
}

public class DeletionLL {
        Node5 head;

        public void push(int data)
        {
            Node5 n = new Node5();
            n.value = data;
            n.next = head;
            head = n;
        }

        public void traverse()
        {
            Node5 temp = head;
            while(temp != null)
            {
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        void deleteN(int pos) {
            Node5 temp = head;

            if (head == null)
                return;

            if (pos == 0)
            {
                head = temp.next;
                return;
            }
            for(int i=0;temp != null && i < pos -1; i++)
                temp = temp.next;
            if(temp ==null || temp.next == null)
                return;

            Node5 next = temp.next.next;
            temp.next = next;

        }

        public static void main(String args[])
        {
            DeletionLL node = new DeletionLL();
            node.push(1);
            node.push(17);
            node.push(21);
            node.push(41);
            node.push(12);
            node.traverse();
            node.deleteN(2);
            node.traverse();
        }
}
