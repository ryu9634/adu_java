public class Homework_Queue {
    private int front;
    private int rear;
    private int capacity;
    private Object[] queue;

    Homework_Queue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        queue = new Object[this.capacity];
    }

    public boolean isFull() {
        return (this.rear == this.capacity - 1);
    }

    public boolean isEmpty() {
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return (this.front == this.rear);
    }

    public void enqueue(Object element) {
        if (isFull()) {
            System.out.println("큐가 채워짐");
            return;
        }

        rear = (rear + 1) % this.capacity;
        queue[rear] = element;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비워짐");
            return null;
        }

        front = (front + 1) % this.capacity;
        return queue[front];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("큐가 비워짐");
            return null;
        }

        return queue[front + 1];
    }

    public int size() {
        return Math.abs((rear + 1) - (front + 1));
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("이미 비워져있음");
        } else {
            front = -1;
            rear = -1;
            queue = new Object[this.capacity];
            System.out.println("비워졌음");
        }
    }

    public void printQueue() {
        System.out.print("[ ");
        for (int i = 0; i <= capacity; i++)
            System.out.print(queue[i] + " ");
        System.out.println("]");
    }
}
