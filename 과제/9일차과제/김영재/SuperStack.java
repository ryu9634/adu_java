import java.util.Arrays;

class SuperStack {
    int top;    //인덱스
    int size;    //스택 배열의 크기
    int [] stack;

    public SuperStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        stack[++top] = item;
    }
    public void pop() {
        System.out.println(stack[top]);
        int pop = stack[top];
        stack[top--] = 0;
    }
    public void peek() {
        System.out.println(stack[top]);
    }

    @Override
    public String toString() {
        return  Arrays.toString(stack) ;

    }
}
