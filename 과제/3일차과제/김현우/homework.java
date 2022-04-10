import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.가위, 2.바위, 3.보 중 하나를 선택하세요");
        double random = Math.random();
        int user = sc.nextInt();
        int com = (int)(random * 3);

        switch (user) {
            case 1:
                if (com == 0) {
                    System.out.println("컴퓨터: 가위");
                    System.out.println("유저: 가위");
                    System.out.println("비겼습니다!");
                } else if (com == 1) {
                    System.out.println("컴퓨터: 바위");
                    System.out.println("유저: 가위");
                    System.out.println("졌습니다!");
                } else if (com == 2) {
                    System.out.println("컴퓨터: 보");
                    System.out.println("유저: 가위");
                    System.out.println("이겼습니다!");
                }
                break;
            case 2:
                if (com == 0) {
                    System.out.println("컴퓨터: 가위");
                    System.out.println("유저: 바위");
                    System.out.println("이겼습니다!");
                } else if (com == 1) {
                    System.out.println("컴퓨터: 바위");
                    System.out.println("유저: 바위");
                    System.out.println("비겼습니다!");
                } else if (com == 2) {
                    System.out.println("컴퓨터: 보");
                    System.out.println("유저: 바위");
                    System.out.println("졌습니다!");
                }
                break;
            case 3:
                if (com == 0) {
                    System.out.println("컴퓨터: 가위");
                    System.out.println("유저: 보");
                    System.out.println("졌습니다!");
                } else if (com == 1) {
                    System.out.println("컴퓨터: 바위");
                    System.out.println("유저: 보");
                    System.out.println("이겼습니다!");
                } else if (com == 2) {
                    System.out.println("컴퓨터: 보");
                    System.out.println("유저: 보");
                    System.out.println("비겼습니다!");
                }
                break;
            default:
                System.out.println("숫자로 입력하세요");
        }
    }
}