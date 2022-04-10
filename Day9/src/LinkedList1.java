import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("김사과");
        linkedList.add("반하나");
        linkedList.add("오렌지");
        linkedList.add("이메론");
        linkedList.add("박체리");
        linkedList.add("배애리");
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        linkedList.remove("오렌지");
        System.out.println(linkedList);
    }
}
