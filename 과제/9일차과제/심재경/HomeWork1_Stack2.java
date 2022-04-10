public class Stack2 {
    private int top;
    private int size;
    private int[] stack;

    public Stack2(int size) {
        this.top = -1;
        this.size= size;
        this.stack = new int[size];
    }

    public int pop(){
        return stack[top--];
    }

    public void push(int num){
        stack[++top]= num;
    }

    public  int peek(){
        return  stack[top];
    }
}
