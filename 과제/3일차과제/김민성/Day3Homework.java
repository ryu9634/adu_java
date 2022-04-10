/*과제.
        가위바위보 게임 만들기

        결과
        가위, 바위, 보 중 하나를 선택하세요. 가위

        컴퓨터 : 보
        유저 : 가위
        이겼습니다!

        컴퓨터 : 바위
        유저 : 가위
        졌습니다!
*/

import java.util.Scanner;

public class Day3Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.가위 2.바위 3.보");
        int input = sc.nextInt(); // 가위,바위,보 입력

        double random = Math.random();
        int randomNum = (int) random * 3 + 1;

        if (randomNum == 3) {
            if (input == 2) {
                System.out.println("컴퓨터 :보");
                System.out.println("유저:바위");
                System.out.println("졌습니다");
            }
            if (input == 1) {
                System.out.println("컴퓨터 :바위");
                System.out.println("유저:가위");
                System.out.println("이겼습니다");
            }
            if (input == 3) {
                System.out.println("컴퓨터 : 보");
                System.out.println("유저:보");
                System.out.println("비겼습니다");
            } else if (randomNum == 3) {
                System.out.println("컴퓨터 : 보");
                System.out.println("유저 : 바위");
                System.out.println("졌습니다");
            } else if (randomNum == 2) {
                System.out.println("컴퓨터 : 바위");
                System.out.println("유저 : 보");
                System.out.println("이겼습니다");
            } else if (randomNum == 1) {
                System.out.println("컴퓨터 : 가위");
                System.out.println("유저 : 보");
                System.out.println("졌습니다");
            } else if (randomNum == 2) {
                System.out.println("컴퓨터 : 바위");
                System.out.println("유저 : 보");
                System.out.println("이겼습니다");
            } else if (randomNum == 3) {
                System.out.println("컴퓨터 : 보");
                System.out.println("유저 : 보");
                System.out.println("비겼습니다");
            }
        } else {
            System.out.println("가위바위보 종료");
            System.out.println("가위바위보 프로그램 종료");

        }


    }

}





