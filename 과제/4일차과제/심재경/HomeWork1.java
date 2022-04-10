import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        while (true) {
            double random = Math.random();
            int com = (int) (random * 3);
            Scanner sc = new Scanner(System.in);

            System.out.println("가위 바위 보 중에 하나를 선택해주세요.");
            String user = sc.next();


            if (user.equals("가위")) {
                if (com == 0) {
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 가위 ");
                    System.out.println("비겼습니다.");
                } else if (com == 1) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 가위");
                    System.out.println("졌습니다.");
                } else {
                    System.out.println("컴퓨터 :보");
                    System.out.println("유저 :가위");
                    System.out.println("이겼습니다");
                    break;
                }

            } else if (user.equals("바위")) {
                if (com == 0) {
                    System.out.println("컴퓨터 :가위");
                    System.out.println("유저 : 바위 ");
                    System.out.println("이겼습니다");
                    break;
                } else if (com == 1) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 바위 ");
                    System.out.println("비겼습니다.");
                } else {
                    System.out.println("컴퓨터 :보");
                    System.out.println("유저 : 바위 ");
                    System.out.println("졌습니다.");
                }

            } else if (user.equals("보")) {
                if (com == 0) {
                    System.out.println("컴퓨터 :가위");
                    System.out.println("유저 : 보 ");
                    System.out.println("졌습니다.");
                } else if (com == 1) {
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 보 ");
                    System.out.println("이겼습니다.");
                    break;
                } else {
                    System.out.println("컴퓨터 :보");
                    System.out.println("유저 : 보 ");
                    System.out.println("비겼습니다.");
                }


            } else {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
            }

        }
    }
}
