import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.print("(Stack)숫자 5개를 입력하세요 >>> ");
        for (int i = 0; i < 5; i++) {
            myStack.push(sc.nextInt());
        }
        myStack.stack();                                 // 전부 출력
        System.out.println("");
        System.out.println(myStack.peek());                 // peek
        System.out.println(myStack.pop());                  // pop
        myStack.stack();
        System.out.println("");

        MyQueue myQueue = new MyQueue();
        System.out.print("(Queue)숫자 5개를 입력하세요 >>> ");
        for (int i = 0; i < 5; i++) {
            myQueue.offer(sc.nextInt());
        }
        myQueue.queue();
        System.out.println("");
        System.out.println(myQueue.peek());                  // peek
        System.out.println(myQueue.poll());                  // poll
        myQueue.queue();
    }
}