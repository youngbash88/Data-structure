public class Linkedlist {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void insertBegin(int data) {
        if (size == 0) {
            Node tmp = new Node();
            tmp.data = data;
            head = tmp;
            tail = tmp;
            size++;
        } else {
            Node tmp = new Node();
            Node h = tail;
            tmp.data = data;
            tail.next = tmp;
            tail = tmp;
            tail.prev = h;
            size++;
        }
    }
    
    

    public void insertEnd(int num) {
        if (size == 0) {
            Node tmp = new Node();
            tmp.data = num;
            head = tmp;
            tail = tmp;
            size++;
        } else {
            Node tmp = new Node();
            Node h = head;
            tmp.data = num;
            tmp.next = head;
            head = tmp;
            h.prev = head;
            size++;
        }

    }
    public void view ()
    {
        Node h =tail;
        while(h!=null)
        {
            System.out.print(h.data + " " );
            h = h.prev;
        }
        System.out.println();
    }
    public Node find (int num)
    {
        Node h = tail;
        while(h!=null)
        {
            if(h.data == num)
            {
                return h;
            }
            h = h.prev;
        }
        return null;
    }

}
