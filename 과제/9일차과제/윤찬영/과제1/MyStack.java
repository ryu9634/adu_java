import java.util.Arrays;

public class MyStack {
    private int count = 1;
    private int [] str = new int[5];

    public void stack(){
        for (int i = 0; i < count-1; i++) {
            System.out.print(str[i] + " ");
        }
    }

    public void push(int num){ // 배열 끝에 저장
        str[count-1] = num;
        count++;
    }

    public int peek(){ // 배열 끝에 데이터 반환
        int temp = str[count-2];
        return temp;
    }

    public int pop(){ // 배열 끝 데이터를 삭제
        int temp = str[count-2];
        count--;
        return temp;
    }
}
