
public class HomeWork1 {
    public static void main(String[] args) {
        Stack2 stack2 =new Stack2(4);

        stack2.push(10); //10
        System.out.println(stack2.peek());
        stack2.push(5); //5
        System.out.println(stack2.peek());
        stack2.push(7); //7
        System.out.println(stack2.peek());
        stack2.push(3); //3
        System.out.println(stack2.peek());

        System.out.println();
        System.out.println(stack2.peek()); //3
        stack2.pop(); //3 -pop
        System.out.println(stack2.peek()); //7
        stack2.pop(); //7-pop
        System.out.println(stack2.peek()); //5
        stack2.pop(); //5-pop
        System.out.println(stack2.peek()); //10






    }
}

