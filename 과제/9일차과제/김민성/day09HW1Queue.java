import java.util.LinkedList;
import java.util.Queue;

public class day09HW1Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(600);
        queue.offer(700);
        queue.offer(800);
        queue.offer(900);

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.clear();
    }
}
