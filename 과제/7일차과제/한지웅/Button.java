import java.util.Scanner;

public class Button {
    //  private int count = 0;
    private static int count = 0; //모든 객체가 공유하게됨(공용변수)
    public void click(){
        count++;
        
        System.out.println("회원님의 운동횟수는" + count + "번째입니다");

    }
}