
/*

😒 과제 1 : 자바 배열을 이용하여 Queue 기능 구현
            * Queue FIFO(First Input First Out)

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

public class JavaQuSt {
    private int cnt = 1;
    private int temp = 0;
    private int[] str1 = new int[10];
    private int[] str2 = new int[10];


/*
        Stack
        ✔ push() : 요소 추가
        ✔ peek() : 마지막(첫번째로 출력될) 데이터 반환
        ✔ pop() : 마지막(첫번째로 출력될) 데이터 반환 후 삭제
        ✔ search() : 검색하고자 하는 데이터가 출력될 순서 확인
        ✔ clear() : 데이터 삭제
*/
    public void push(int num){
        str1[cnt-1] = num;
        cnt++;
    }

    public int peekSt(){
        temp = str1[cnt-1];
        return temp;
    }

    public int pop(){
     temp = str1[cnt-1];
        cnt--;
        return temp;
    }

    public void search(){
        for (int i = 0; i < cnt-1; i++) {
            System.out.println(str1[i] + " ");
        }
    }
    /*
        Queue
        ✔ offer() : 요소 추가
        ✔ peek() : 첫번째 데이터 반환
        ✔ poll() : 첫번째 데이터 반환 후 제거 = remove()와 동일
        ✔ clear : queue 값 삭제
     */

    public void offer(int num){
        str2[cnt-1] = num;
        cnt++;
    }

    public int peekQu(){
        temp = str2[cnt-1];
        return temp;
    }

    public int poll(){
        temp = str2[cnt-1];
        --cnt;
        return temp;
    }

}
