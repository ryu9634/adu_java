import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //컴퓨터가 불러 올 랜덤 정수에 문자를 할당하기 위해 String 선언 및 할당
        String rock = "바위"; // 바위는 1
        String scis = "가위"; // 가위는 2
        String paper = "보"; // 보는 3

        //cpu 값 초기화
        int cpu = 0;

        //정수에 문자를 할당하기 위한 String
        String cpu_Converting;

        // r 객체 선언 및 할당
        Random r = new Random();

        // r.nextInt(바운더리) -> 0~바운더리 값의 Random 정수를 불러옴 -> 위에서 할당한 바위1, 가위2, 보3 을 위해 +1(그냥 0-2 값으로 지정해도 무관)
        cpu = r.nextInt(3)+1;

        System.out.println("가위, 바위, 보 중 하나를 선택하세요 : " );
        String put1 = sc.next();
        System.out.println("");

        //정수에 문자 할당 과정
        if(cpu == 1){
            cpu_Converting = rock;
        }else if(cpu == 2){
            cpu_Converting = scis;
        }else cpu_Converting = paper;

//        System.out.println(cpu);  -> 진짜 1번이 바위로 나오는지, 2번이 가위로 나오는지 확인가능.

        System.out.println("컴퓨터 : " + cpu_Converting);
        System.out.println("유저 : " + put1);

        //값 비교 후 승패 확인할 수 있는 알고리즘 작성
        if(put1.equals("바위")){
            if(cpu == 1){
                System.out.println("비겼습니다!");
            }else if(cpu==2){
                System.out.println("이겼습니다!");
            }else{
                System.out.println("졌습니다!");
            }
        }

        if(put1.equals("가위")){
            if(cpu == 1){
                System.out.println("졌습니다!");
            }else if(cpu==2){
                System.out.println("비겼습니다!");
            }else{
                System.out.println("이겼습니다!");
            }
        }

        if(put1.equals("보")){
            if(cpu == 1){
                System.out.println("이겼습니다!");
            }else if(cpu==2){
                System.out.println("졌습니다!");
            }else{
                System.out.println("비겼습니다!");
            }
        }
    }
}
