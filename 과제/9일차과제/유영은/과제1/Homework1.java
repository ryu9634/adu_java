import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Queue que = new Queue();
        que.offer(50);
        que.offer(60);
        que.offer(88);
        que.offer(70);
        que.offer(90);
        que.print();
        System.out.println(que.peek());
        System.out.println(que.poll());
        que.print();
        que.remove();
        que.print();
        que.clear();
        que.print();
        System.out.println();

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(40);
        stack.push(60);

        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.peek());
        stack.clear();
        stack.print();

    }


}
