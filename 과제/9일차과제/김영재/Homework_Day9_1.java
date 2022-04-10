public class Homework_Day9_1 {
    public static void main(String[] args) {
        SuperStack superStack = new SuperStack(5);
        superStack.push(20);
        superStack.push(10);
        superStack.push(30);
        superStack.push(40);
        superStack.push(60);

        System.out.println(superStack);
        superStack.peek();
        superStack.pop();
        System.out.println(superStack);

        SuperQueue superQueue = new SuperQueue(5);
        superQueue.push(1);
        superQueue.push(2);
        superQueue.push(3);
        superQueue.push(4);
        superQueue.push(5);

        System.out.println(superQueue);
        System.out.println(superQueue.peek());
        System.out.println(superQueue.pop());
        System.out.println(superQueue);
    }


}
