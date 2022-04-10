//push(), pop(), peek()
//
//class SuperStack{
//    배열
//
//    public void push(int num){
//        배열 끝에 데이터를 저장
//    }
//
//    public int peek(){
//        return 배열 끝 데이터;
//    }
//
//    public int pop(){
//        배열 끝 데이터를 삭제
//        return 배열 끝 데이터;
//    }
//}

import java.util.Arrays;

public class Superstack {
    private int max;    // 스택 용량
    private int ptr;    // 스택 포인터
    private int[] stk;  // 스택 본체


    public Superstack(int max){
        ptr = 0;
        this.max = max;
        stk = new int[max];
    }

    public int push(int x){
        return stk[ptr++] = x;
    }

    public int peek(){
        return stk[ptr-1];
    }

    public int pop(){
        return stk[--ptr];
    }

    public void stack(){
        for (int i = 0; i < stk.length-1; i++) {
            System.out.print(stk[i] + " ");
        }
    }
}

