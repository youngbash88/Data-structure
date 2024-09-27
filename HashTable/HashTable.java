public class HashTable {

    private MyLinkedlist[] array = new MyLinkedlist[10];  
    private int size = 10;

    public HashTable() {
        
        for (int i = 0; i < size; i++) {
            array[i] = new MyLinkedlist();
        }
    }

    
    private int hashFunction(int key) {
        return key % size;  
    }

    
    public void insert(int key) {
        int index = hashFunction(key);  
        array[index].insert(key);  
    }

   
    public Node find(int key) {
        int index = hashFunction(key);  
        return array[index].find(key);  
    }

    public void view() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            array[i].view();
        }
    }
    

}
