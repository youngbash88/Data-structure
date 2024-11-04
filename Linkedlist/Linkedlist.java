public class Linkedlist {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

   public void insertBegin(int data) {
        Node tmp = new Node();
        tmp.data = data;
        tmp.next = head;

        if (head != null) {
            head.prev = tmp;
        } else {
            tail = tmp;
        }

        head = tmp;
        size++;
    }
    
    

   public void insertEnd(int data) {
        Node tmp = new Node();
        tmp.data = data;
        tmp.prev = tail;

        if (tail != null) {
            tail.next = tmp;
        } else {
            head = tmp; 
        }

        tail = tmp;
        size++;
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
