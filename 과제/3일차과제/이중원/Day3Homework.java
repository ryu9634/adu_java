/*
    날짜 : 2021.11.08
    제작자 : 이중원

    과제.
    가위바위보 게임 만들기

    결과
    가위, 바위, 보 중 하나를 선택하세요. 가위

    컴퓨터 : 보
    유저 : 가위
    이겼습니다.

    컴퓨터 : 바위
    유저 : 가위
    졌습니다.
 */

import java.util.Scanner;

public class Day3Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위, 바위, 보 중 하나를 선택하세요 : ");
        String input = sc.next(); // 가위,바위, 보 입력


        double random = Math.random();
        int randomNum = (int) random * 3 + 1; //1, 2, 3

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
            }
        } else if (input.equals("바위")) {
            if (randomNum == 1) {
                System.out.println("컴퓨터 : 가위");
                System.out.println("유저 : 바위");
                System.out.println("이겼습니다.");
            } else if (randomNum == 2) {
                System.out.println("컴퓨터 : 바위");
                System.out.println("유저 : 바위");
                System.out.println("비겼습니다.");
            } else {
                System.out.println("컴퓨터 : 보");
                System.out.println("유저 : 바위");
                System.out.println("졌습니다.");
            }
        } else if(input.equals("보")){
            if (randomNum == 1) {
                System.out.println("컴퓨터 : 가위");
                System.out.println("유저 : 보");
                System.out.println("졋습니다.");
            } else if (randomNum == 2) {
                System.out.println("컴퓨터 : 바위");
                System.out.println("유저 : 보");
                System.out.println("이겼습니다.");
            } else {
                System.out.println("컴퓨터 : 보");
                System.out.println("유저 : 보");
                System.out.println("비겼습니다.");
            }
        }else{
            System.out.println("잘못 입력했습니다.");
            System.out.println("프로그램 종료.");
        }

    }
}
