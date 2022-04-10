import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임이 시작합니다.");
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
        String user = sc.next();
        double random = Math.random();
        int Com = (int) (Math.random() * 3) + 1;

        System.out.println("User : " + user);
        if (Com == 1) {
            System.out.println("Com : 가위");
        } else if (Com == 2) {
            System.out.println("Com : 바위");
        } else {
            System.out.println("Com : 보");
        }

        if (user.equals("가위")) {
            if (Com == 1) {
                System.out.println("----draw----");
            } else if (Com == 2) {
                System.out.println("ㅠㅠㅠㅠLoseㅠㅠㅠㅠ");
            } else {
                System.out.println("****Win****");
            }
        } else if (user.equals("바위")) {
            if (Com == 1) {
                System.out.println("----draw----");
            } else if (Com == 2) {
                System.out.println("ㅠㅠㅠㅠLoseㅠㅠㅠㅠ");
            } else {
                System.out.println("****Win****");
            }
        } else if (user.equals("보")) {
            if (Com == 1) {
                System.out.println("ㅠㅠㅠㅠLoseㅠㅠㅠㅠ");
            } else if (Com == 2) {
                System.out.println("****Win****");
            } else {
                System.out.println("----draw----");
            }
        } else {
            System.out.println("경고 : 입력된 값이 정확하지 않습니다.");

        }
        System.out.println("End");
    }
}

