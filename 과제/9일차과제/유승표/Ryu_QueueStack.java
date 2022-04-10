public class Ryu_QueueStack {
    public static void main(String[] args) {
        RyuQueue queue = new RyuQueue();

        int[] a;
        queue.offer(4);
        queue.offer(3);
        queue.offer(7);
        queue.offer(8);


        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        /*
        그거 = 4, 는 이거 = [4, 3, 7, 8, 0]}
        4
        4
        그거 = 4, 는 이거 = [3, 7, 8, 0, 0]}
         */
        RyuStack stack = new RyuStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(0);
        stack.push(0);


        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        /*
        RyuStack{arrayNum=5, stack=[1, 2, 3, 0, 0]}
        3
        RyuStack{arrayNum=5, stack=[1, 2, 3, 0, 0]}
        3
        RyuStack{arrayNum=5, stack=[1, 2, 0, 0, 0]}
         */

    }

}
