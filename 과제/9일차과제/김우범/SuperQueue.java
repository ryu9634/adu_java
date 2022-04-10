import java.util.LinkedList;
import java.util.Queue;

public class SuperQueue {
    public static void main(String[] args) {
        Queue<Integer> superQueue = new LinkedList<>();
        superQueue.offer(100);
        superQueue.offer(200);
        superQueue.offer(300);
        System.out.println(superQueue);

        superQueue.poll();
        System.out.println(superQueue);

        superQueue.offer(50);
        System.out.println(superQueue);

        superQueue.clear();
        System.out.println(superQueue);

    }

}
