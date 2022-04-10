// 가위바위보 게임(유저가 이길때까지 게임 반복)

import java.util.Scanner;

public class HomeWork1_Day4_gababo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // 가위 바위 보 중 하나 사용자 입력
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
        String gababo = sc.next();
        System.out.println("사용자 : " + gababo);

        while (true) {
            double random = Math.random();                             // 컴퓨터의 가위 바위 보 출력
            int num = (int) (random * 10);

            if (num >= 0 && num <= 2) {
                System.out.print("컴퓨터 : ");
                System.out.println("가위");

            } else if (num >= 3 && num <= 5) {
                System.out.print("컴퓨터 : ");
                System.out.println("바위");

            } else {
                System.out.print("컴퓨터 : ");
                System.out.println("보");
            }

            if (gababo.equals("가위")) {                          // 가위 바위 보 경우별 승 패 여부 출력
                if (num >= 6 && num <= 9) {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "보");
                    System.out.println("사용자가 승리하였습니다.");
                    System.out.println("게임을 종료합니다.");
                    break;
                } else if (num >= 0 && num <= 2) {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "가위");
                    System.out.println("비겼습니다.");
                    continue;
                } else {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "바위");
                    System.out.println("사용자가 패배하였습니다.");
                    continue;
                }
            }
            if (gababo.equals("바위")) {
                if (num >= 0 && num <= 2) {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "보");
                    System.out.println("사용자가 승리하였습니다.");
                    System.out.println("게임을 종료합니다.");
                    break;
                } else if (num >= 3 && num <= 5) {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "바위");
                    System.out.println("비겼습니다.");
                    continue;
                } else {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "가위");
                    System.out.println("사용자가 패배하였습니다.");
                    continue;
                }
            }
            if (gababo.equals("보")) {
                if (num >= 3 && num <= 5) {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "바위");
                    System.out.println("사용자가 승리하였습니다.");
                    System.out.println("게임을 종료합니다.");
                    break;
                } else if (num >= 6 && num <= 9) {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "보");
                    System.out.println("비겼습니다.");
                    continue;
                } else {
                    System.out.println("사용자 : " + gababo + " vs " + "컴퓨터 : " + "가위");
                    System.out.println("사용자가 패배하였습니다.");
                    continue;
                }
            }
        }
    }
}

