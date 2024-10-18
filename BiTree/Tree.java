public class Tree {
    private Node root;

    Tree() {
        root = null;
    }
    public void insert(int data) {
        Node newNode = new Node();
        newNode.num = data;

        Node curr = root;
        Node pre = null;

        while (curr != null) {
            pre = curr;
            if (data < curr.num) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        
        if (pre == null) {
            root = newNode;
        } else if (data < pre.num) {
            pre.left = newNode;  
        } else {
            pre.right = newNode;
        }
    }
    public Node search(int data) {
        Node curr = root;

        while (curr != null && curr.num != data) {
            if (data < curr.num) {
                curr = curr.left;  
            } else {
                curr = curr.right;
            }
        }

        
        return curr;
    }
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);      
        System.out.print(node.num + " ");  
        inorder(node.right);
    }
    public Node getRoot (){
        return root;
    }
}
