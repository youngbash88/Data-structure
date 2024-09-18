public class stack {
    private int [] arr;
    private int top;
    stack (){
    
        this.top = 0;
        this.arr = new int[100];
    }
    public void push(int num)
    {
        this.arr[top]=num;
        this.top++;
    }
    public int peek() {
        if (top > 0) {
            return arr[top - 1];  
        }
        return -1;  
    }
    public int pop()
    {
    
        top--;
        return arr[top];
    }
    public boolean isEmpty()
    {
        if(this.top ==0) return true;
        return false;
    }
}
