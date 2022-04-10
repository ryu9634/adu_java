import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HomeWork {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();//push, pop, peek, empty, seach 지원
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.print(stack.peek()+" ");
        } //1, 2, 3, 4, 5 출력
        System.out.println("");
        stack.pop();        //해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거함.
        System.out.println(stack);
        System.out.println(stack.peek());    //4출력  해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환함
        System.out.println(stack.search(3));    //2출력
        //해당 스택에서 전달된 객체가 존재하는 위치의 인덱스를 반환함.
        //이때 인덱스는 제일 상단에 있는(제일 마지막으로 저장된) 요소의 위치부터 0이 아닌 1부터 시작함.
        System.out.println(stack.empty());    //false출력
        //해당 스택이 비어 있으면 true를, 비어 있지 않으면 false를 반환함.
    }
    }


    class HomeWork2{
        public static void main(String[] args) {
            Queue<Integer>queue= new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                queue.add(i);       //for문이 돌면서 queue에 i값을 입력을 해줌
                       //해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.
            }System.out.println(queue);
            System.out.println(queue.peek()); //결과값 0 첫번째 데이터를 반환한다
            System.out.println(queue.poll());   //첫번째 데이터를 반환하고 삭제
            System.out.println(queue);
            System.out.println(queue.remove()); // 첫번째 데이터를 반환하고 삭제
            System.out.println(queue);
            queue.clear();      //모든 데이터를 삭재시킨다
            System.out.println(queue);


            }
        }


