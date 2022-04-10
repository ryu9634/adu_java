import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String win = "이겼습니다.", lose = "졌습니다.", draw = "비겼습니다.";
        String brk = "";

        while (true) {
            System.out.println("가위, 바위, 보 중 선택하세요");
            String choice = sc.next();
            int com = (int) (Math.random() * 3) + 1;
            if (com == 1) {
                System.out.println("컴퓨터 : 가위");
            } else if (com == 2) {
                System.out.println("컴퓨터 : 바위");
            } else {
                System.out.println("컴퓨터 : 보");
            }
            System.out.println("유저 : " + choice);

            switch (choice) {
                case "가위":
                    if (com == 1) {
                        brk = draw;
                    } else if (com == 2) {
                        brk = lose;
                    } else {
                        brk = win;
                    }
                    System.out.println(brk);
                    break;
                case "바위":
                    if (com == 1) {
                        brk = win;
                    } else if (com == 2) {
                        brk = draw;
                    } else {
                        brk = lose;
                    }
                    System.out.println(brk);
                    break;
                case "보":
                    if (com == 1) {
                        draw = lose;
                    } else if (com == 2) {
                        brk = win;
                    } else {
                        brk = draw;
                    }
                    System.out.println(brk);
                    break;
                default:
                    System.out.println("가위, 바위, 보 중에서만 선택하세요\n");
            }
            if (brk == win) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
