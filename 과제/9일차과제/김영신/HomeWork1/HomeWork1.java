public class HomeWork1 {
    public static void main(String[] args) {
        HomeWork1_Stack stack = new HomeWork1_Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        System.out.println(stack.search(2));
        System.out.println(stack.search(3));

        HomeWork1_Queue queue = new HomeWork1_Queue();
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.size());
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        System.out.println(queue.search(4));
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);
        queue.offer(11);
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
