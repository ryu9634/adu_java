/*
    자바 배열을 이용하여 스택, 큐를 직접 구현하기

    push(), pop(), peek()

    class SuperStack{
        배열

        public void push(int num){
            배열 끝에 데이터를 저장
        }

        public int peek(){
            return 배열 끝 데이터;
        }

        public int pop(){
            배열 끝 데이터를 삭제
            return 배열 끝 데이터;
        }
    }
*/

import java.util.Arrays;

class SuperStack {
    int[] numArr = new int[5];
    int i = 0;
    int tmp;
    int indexNum = 0;

    public void push(int num) {
        numArr[indexNum] = num;
        indexNum++;
    }

    public int peek() {
        while (true) {
            if (numArr[i] == 0) {
                i--;
                tmp = numArr[i];
                break;
            }
            i++;
        }
        return tmp;
    }

    public int pop() {
        while (true) {
            if (numArr[i] == 0) {
                i--;
                tmp = numArr[i];
                numArr[i] = 0;
                break;
            }
            i++;
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Stack=" + Arrays.toString(numArr);
    }
}

class SuperQueue {
    int indexNum = 0;
    int[] numArr = new int[5];
    int tmp;

    public void push(int num) {
        numArr[indexNum] = num;
        indexNum++;
    }

    public int peek() {
        return numArr[0];
    }

    public int pop() {
        int firstIndex = 0;
        int nextIndex = 1;
        int pastIndex = numArr[0];
        while (nextIndex < numArr.length){
            tmp = numArr[firstIndex];
            numArr[firstIndex] = numArr[nextIndex];
            firstIndex++;
            nextIndex++;
        }
        return pastIndex;
    }

    @Override
    public String toString() {
        return "Queue=" + Arrays.toString(numArr);
    }
}

public class Day9Homework1 {
    public static void main(String[] args) {
        SuperStack stack = new SuperStack();
        SuperQueue queue = new SuperQueue();

        stack.push(10);
        stack.push(5);
        stack.push(14);
        stack.push(17);
        System.out.println(stack); // Stack=[10, 5, 14, 17, 0]
        System.out.println(stack.peek()); // 17
        System.out.println(stack.pop()); // 17
        System.out.println(stack); // Stack=[10, 5, 14, 0, 0]

        queue.push(10);
        queue.push(5);
        queue.push(14);
        queue.push(17);
        System.out.println(queue); // Queue=[10, 5, 14, 17, 0]
        System.out.println(queue.peek()); // 10
        System.out.println(queue.pop()); // 10
        System.out.println(queue); // Queue=[5, 14, 17, 0, 0]
    }
}
