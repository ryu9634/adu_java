// 가위, 바위, 보 중 하나를 선택하세요.
// 가위 선택시
// 컴퓨터 : 보, 유저 : 가위 유저 승
// 컴퓨터 : 바위, 유저 : 가위 컴퓨터 승


import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
        String gababo = sc.next();
        System.out.println("사용자 : " + gababo);      // 사용자 입력값 출력

        double random = Math.random();
        int num = (int) (random * 10);

        if (num >= 0 && num <= 2) {                   // 컴퓨터 출력값 임의 지정(0~2 가위, 3~5 바위, 6~9 보)
            System.out.print("컴퓨터 : ");
            System.out.println("가위");
        } else if (num >= 3 && num <= 5) {
            System.out.print("컴퓨터 : ");
            System.out.println("바위");
        } else {
            System.out.print("컴퓨터 : ");
            System.out.println("보");
        }

        if (gababo.equals("가위")) {
            if (num >= 6 && num <= 9) {
                System.out.println("사용자가 이겼습니다.");
            } else if (num >= 0 && num <= 2) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
        if (gababo.equals("바위")) {
            if (num >= 0 && num <= 2) {
                System.out.println("사용자가 이겼습니다.");
            } else if (num >= 3 && num <= 5) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
        if (gababo.equals("보")) {
            if (num >= 3 && num <= 5) {
                System.out.println("사용자가 이겼습니다.");
            } else if (num >= 6 && num <= 9) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
    }
}