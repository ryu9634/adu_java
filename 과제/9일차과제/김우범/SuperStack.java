import java.util.Stack;


public class SuperStack {
    public static void main(String[] args) {
        Stack<Integer> superStack = new Stack<>();
        superStack.push(100);
        superStack.push(200);
        superStack.push(300);
        System.out.println(superStack);
        System.out.println(superStack.peek());
        superStack.pop();
        System.out.println(superStack);
        superStack.peek();
        superStack.push(50);
        System.out.println(superStack);


    }
}
