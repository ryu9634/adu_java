/*
    가위바위보 게임을 만들기
    (단, 유저가 이길때까지 게임을 반복)
*/
import java.util.Scanner;

public class Day4Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("가위, 바위, 보 중 하나를 선택하세요 : ");
            String input = sc.next(); // 가위,바위, 보 입력

            double random = Math.random();
            int randomNum = (int)(random * 3) + 1; //1, 2, 3

            if (input.equals("가위")) {
                if (randomNum == 1) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 가위");
                    System.out.println("비겼습니다.");
                } else if (randomNum == 2) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 가위");
                    System.out.println("졌습니다.");
                } else {
                    System.out.println("컴퓨터 : 보");
                    System.out.println("유저 : 가위");
                    System.out.println("이겼습니다.");
                    break;
                }
            } else if (input.equals("바위")) {
                if (randomNum == 1) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 바위");
                    System.out.println("이겼습니다.");
                    break;
                } else if (randomNum == 2) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 바위");
                    System.out.println("비겼습니다.");
                } else {
                    System.out.println("컴퓨터 : 보");
                    System.out.println("유저 : 바위");
                    System.out.println("졌습니다.");
                }
            } else if (input.equals("보")) {
                if (randomNum == 1) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 보");
                    System.out.println("졋습니다.");
                } else if (randomNum == 2) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 보");
                    System.out.println("이겼습니다.");
                    break;
                } else {
                    System.out.println("컴퓨터 : 보");
                    System.out.println("유저 : 보");
                    System.out.println("비겼습니다.");
                }
            } else {
                System.out.println("잘못 입력했습니다.");
                System.out.println("프로그램 종료.");
                break;
            }
        }
    }
}
