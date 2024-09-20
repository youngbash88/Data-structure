public class Main {

    public static void main(String[] args) {
        Linkedlist num = new Linkedlist();
        num.insertEnd(6);
        num.insertEnd(8);
        num.insertEnd(7);
        num.insertEnd(99);
        num.insertBegin(77);
        num.view();
        Node x = num.find(6);
        System.out.println(x.data);
    }
}
