public class Main {
    public static void main(String[] args) {
        
        HashTable ht = new HashTable();
        
        ht.insert(10);
        ht.insert(20);
        ht.insert(15);
        ht.insert(25);
        ht.insert(35);
        ht.insert(5);
        
        ht.view();
        
        // Find a key
        Node result = ht.find(15);
        if (result != null) {
            System.out.println("Found key: " + result.key);
        } else {
            System.out.println("Key not found");
        }
    }
}