public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        Node result = tree.search(60);
        if (result != null) {
            System.out.println("found: " + result.num);
        } else {
            System.out.println("not found");
        }


        System.out.println("In-order traversal of the tree:");
        tree.inorder(tree.getRoot());
    }
}
