/*
과제1.
자바 배열을 이용하여 스택(팝과 푸시메소드를 이용하여 직접 저장시켜봐라), 큐 를 직접 구현하기
 */
class SuperQueue {
    private int front;
    private int rear;
    private int capacity;
    private Object[] queue;

    SuperQueue(int capacity){
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        queue = new Object[this.capacity];
    }

    public boolean isFull() {
        return (this.rear == this.capacity-1);
    }

    public boolean isEmpty() {
        if(front == rear) {
            front = -1;
            rear = -1;
        }
        return (this.front == this.rear);
    }

    public void enqueue(Object element) {
        if(isFull()) {
            System.out.println("Queue is Full!");
            return;
        }

        rear = (rear+1) % this.capacity;
        queue[rear] = element;
    }

    public Object dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        front = (front+1) % this.capacity;
        return queue[front];
    }

    public Object peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return queue[front+1];
    }

    public int size() {
        return Math.abs( (rear+1) - (front+1) );
    }

    public void clear() {
        if(isEmpty()) {
            System.out.println("Queue is already empty!");
        }
        else {
            front = -1;
            rear = -1;
            queue = new Object[this.capacity];
            System.out.println("Queue has cleared!");
        }
    }

    public void printQueue() {
        System.out.print("[ ");
        for (int i = 0; i <= capacity; i++)
            System.out.print(queue[i] + " ");
        System.out.println("]");
    }
}

class SuperStack <T> {
    private int size = -1;
    private int top;
    private T [] stack;

    public SuperStack(int size) {
        top = -1;
        stack = (T[])(new Object[size]);
        this.size = size;
    }

    public void push(T value){
        stack[++top] = value;
    }

    public T peek(){
        return stack[top];
    }

    public T pop(){
        return stack[top--];
    }

    public void printStack() {
        System.out.print("[ ");
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
        System.out.println("]");
    }
}

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("🚍🚍🚍🚍🚍Stack 구현하기🚍🚍🚍🚍🚍");
        SuperStack <Integer> superStack = new SuperStack<>(4);
        superStack.push(3);
        superStack.push(10);
        superStack.push(5);
        superStack.push(7);

        superStack.printStack();
        System.out.println(superStack.pop());
        System.out.println(superStack.pop());
        superStack.printStack();
        System.out.println(superStack.peek());
        System.out.println("----------------------------------");
        SuperQueue superQueue = new SuperQueue(4);
        superQueue.enqueue(10);
        superQueue.enqueue(8);
        superQueue.enqueue(12);
        superQueue.enqueue(3);
        System.out.println(superQueue.peek());
    }
}
