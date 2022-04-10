import java.util.Arrays;

public class MyQueue {
    private int count = 1;
    private int [] str = new int[6];

    public void queue(){
        for (int i = 0; i < count-1; i++) {
            System.out.print(str[i] + " ");
        }
    }

    public void offer(int num){ // 배열 끝에 저장
        str[count-1] = num;                     // str[0] = 10
        count++;                                // count = 1
    }
    public int peek(){ // 배열 첫번째 데이터 반환
        return str[0];                    // 10
    }

    public int poll(){ // 배열 첫번째 데이터를 삭제
        int temp = str[0];
        for (int i = 0; i <count-1; i++) {
            str[i] = str[i+1];
        }
        count--;
        return temp;
    }
}
