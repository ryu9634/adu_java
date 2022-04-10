public class SuperQueue {
    private int max;    // 큐 용량
    private int ptr;    // 큐 포인터
    private int[] queue;  // 큐 본체


    public SuperQueue(int max) {
        ptr = 0;
        this.max = max;
        queue = new int[max];
    }

    public int offer(int x) {
        return queue[ptr++] = x;
    }

    public int peek() {
        return queue[0];
    }

    public int poll(){
        int temp = queue[0];
        for (int i = 0; i < ptr; i++) {
            queue[i] = queue[i+1];
            ptr--;
        }
        return temp;
    }

    public void queue(){
        for (int i = 0; i < queue.length-1; i++) {
            System.out.print(queue[i] + " ");
        }
    }


}
