/*
        작성자 : 이철
        과제: 가위바위보 게임을 만들어라.
 */

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임 시작");
        System.out.println("(1)가위,(2)바위,(3)보를 정하세요");
        String user = sc.next();
        int com = (int) (Math.random()) + 1;

        System.out.println("유저 : " + user);
        if (com == 1) {
            System.out.println("컴퓨터 : 가위");
        } else if (com == 2) {
            System.out.println("컴퓨터 : 바위");
        } else {
            System.out.println("컴퓨터 : 보");
        }

        if (user.equals("가위")) {
            if (com == 1) {
                System.out.println("무승부");
            } else if (com == 2) {
                System.out.println("패배");
            } else {
                System.out.println("승리");
            }
        } else if (user.equals("바위")) {
            if (com == 1) {
                System.out.println("승리");
            } else if (com == 2) {
                System.out.println("무승부");
            } else {
                System.out.println("패배");
            }
        } else if (user.equals("보")) {
            if (com == 1) {
                System.out.println("패배");
            } else if (com == 2) {
                System.out.println("승리");
            } else {
                System.out.println("무승부");
            }
        } else {
            System.out.println("잘못 입력했습니다.");
        }
    }
}
