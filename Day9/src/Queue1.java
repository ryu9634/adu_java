import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(50);
        queue.offer(80);
        queue.offer(20);
        queue.offer(70);
        System.out.println(queue);
        System.out.println(queue.peek());   // 첫번째 데이터를 반환
        queue.poll();   // 첫번째 데이터를 반환하고 삭제
        System.out.println(queue);
        queue.remove(); // 데이터를 삭제
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}
