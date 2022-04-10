class queueTest {
    private int front;
    private int rear;
    private int capacity;
    private Object[] queue;

    queueTest(int capacity){
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


