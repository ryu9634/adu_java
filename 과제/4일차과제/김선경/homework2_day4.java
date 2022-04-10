import java.util.Random;
import java.util.Scanner;

public class homework2_day4 {
    public static void main(String[] args) {
        System.out.println("사칙연산 게임을 해보자!");
        System.out.println("10점 달성시 게임이 종료됩니다.");
        // 최종 점수, 맞출시에 1점씩 늘어날 변수
        int total=0;

        //무한 반복
        while(true) {
            // 피연산자 랜덤
            int a=(int)(Math.random()*10)+1;
            int b=(int)(Math.random()*10)+1;

            //연산자 랜덤
            int op=(int)(Math.random()*4)+1;

            //연산자 출력은 string으로 출력함, com 변수에 계산값 저장하기
            String operator;
            int com;
            if(op==1) {operator="+";com=a+b;}
            else if(op==2) {operator="-"; com=a-b;}
            else if(op==3) {operator="*"; com=a*b;}
            else {operator="/"; com=(int)a/b;}


            // 사용자에게 질문하기
            Scanner sc=new Scanner(System.in);
            System.out.println("다음 ?에 알맞는 숫자를 입력하세요");
            System.out.print(a +" ");
            System.out.print(operator +" ");
            System.out.print(b +" ");
            System.out.print(" = "+" ? ");
            int ans=sc.nextInt();

            // 대답과 정답이 일치할때 total 값 변경시키기
            if(com==ans){
                System.out.println("정답입니다.");
                total++;
            }else System.out.println("오답입니다.");
            // 총 점수가 10일때 break
            if (total == 10) {
                System.out.println("10번을 맞추어 게임을 종료합니다.");
                break;}
        }
    }
}
