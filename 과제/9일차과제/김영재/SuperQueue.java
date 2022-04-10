import java.util.Arrays;

public class SuperQueue {
    int MAX ;
    int front;    //머리 쪽에 위치할 index값, pop할때 참조하는 index
    int rear;    //꼬리 쪽에 위치할 index값, push할때 참조하는 index
    int [] queue;


    public SuperQueue(int MAX) {
        front = rear = 0;    //초기값 0
        queue = new int[MAX]; //배열 생성
    }

    public void push(int value) {

        queue[rear++] = value; //rear가 위치한 곳에 값을 넣어주고 rear를 증가시킨다.
    }
    public int pop() {

        int pop = queue[front];
        return queue[front++] = 0;
    }
    public int peek() {

        int popValue = queue[front];
        return popValue;
    }

    @Override
    public String toString() {
        return  Arrays.toString(queue);

    }
}