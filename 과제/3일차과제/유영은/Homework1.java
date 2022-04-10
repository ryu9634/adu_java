import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위, 바위, 보 중 하나를 선택하세요 ");
        String choice = sc.next();
        int com = (int) (Math.random()) + 1;
        String win = "이겼습니다.", lose = "졌습니다.", draw = "비겼습니다.";

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
                    System.out.println(draw);
                } else if (com == 2) {
                    System.out.println(lose);
                } else
                    System.out.println(win);
                break;
            case "바위":
                if (com == 1) {
                    System.out.println(win);
                } else if (com == 2) {
                    System.out.println(draw);
                } else
                    System.out.println(lose);
                break;
            case "보":
                if (com == 1) {
                    System.out.println(lose);
                } else if (com == 2) {
                    System.out.println(win);
                } else
                    System.out.println(draw);
                break;
            default:
                System.out.println("가위, 바위, 보 중에서만 선택하세요");
        }
    }
}
