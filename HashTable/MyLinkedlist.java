public class MyLinkedlist {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void insert(int key) {
        Node tmp = new Node();
        tmp.key = key;

        if (size == 0) {
            head = tmp;
            tail = tmp;
        } else {
            tail.next = tmp;  
            tail = tmp; 
        }
        size++;
    }
    
    
    
    public void view ()
    {
        Node h =head;
        while(h!=null)
        {
            System.out.print(h.key + " " );
            h = h.next;
        }
        System.out.println();
    }
    public Node find (int num)
    {
        Node h = head;
        while(h!=null)
        {
            if(h.key == num)
            {
                return h;
            }
            h = h.next;
        }
        return null;
    }

}
