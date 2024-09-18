public class queue {
    private long[]arr;
    private int top;
    private int base;
    queue(){
    
        arr = new long[100];
        top = -1;
        base = -1;
    }
    public void insert(int num)
    {
        if(top == -1)
        {
            arr[++top] = num;
            base = top;
        }
        else arr[++top] = num;
    }
    public boolean isEmpty()
    {
        if(top == -1) return true;
        return false;
    }
    public long delete()
    {
        long num = arr[base++];
        if ( top == base){
        top = -1;
        base = -1;
        }
        return num;
    }
    public void display()
    {
        if (isEmpty())
            System.out.println("no elments");
        else
        {
            for(int i = base;i <= top;i++) System.out. println(arr[i]);
        }
    }
        
    
}
