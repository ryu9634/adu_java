import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Homework1 {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);   //push(): 요소를 저장
        stack.push(70);   //push(): 요소를 저장
        stack.push(60);   //push(): 요소를 저장
        stack.push(50); //push(): 요소를 저장
        stack.push(20); //push(): 요소를 저장
        stack.push(30); //push(): 요소를 저장
        System.out.println(stack);
        System.out.println(stack.peek());  //peek(): 마지막(첫번째 뽑힐) 데이터를 반환
        System.out.println(stack);
        System.out.println(stack.pop());  //pop(): 마지막(첫번째 뽑힐) 데이터를 반환하고 삭제
        System.out.println(stack);
        System.out.println(stack.search(70)); //search(): 데이터의 순서 반환

        //-----------------------------------------------------------------------------------------------------------

        Queue<Integer> queue=new LinkedList<>();
        queue.offer(100); //offer():요소를 추가
        queue.offer(105); //offer():요소를 추가
        queue.offer(109); //offer():요소를 추가
        queue.offer(104); //offer():요소를 추가
        queue.offer(150); //offer():요소를 추가
        queue.offer(505); //offer():요소를 추가
        System.out.println(queue);
        System.out.println(queue.peek()); //첫번째 데이터를 반환
        queue.poll();  //첫번째 데이터를 반환하고 삭제
        System.out.println(queue);
        queue.remove(); //데이터를 삭제
        System.out.println(queue);
        queue.clear();  //queue 초기화
        System.out.println(queue);


    }
}
