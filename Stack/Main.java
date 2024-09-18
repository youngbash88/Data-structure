public class Main {
    

    public static void main(String[] args) {
        stack s = new stack();
        s.push(4);
        s.push(5);
        s.push(7);
        while(!s.isEmpty())
        {
            int i = s.pop();
            System.out.println(i);
            
        }
        
    }
}
