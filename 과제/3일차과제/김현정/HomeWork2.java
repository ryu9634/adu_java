import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보를 입력하세요");
        String use = sc.next();

        System.out.println("유저 : " + use);
        double random = Math.random();
        int cpu = (int) (random * 3) + 1;
        switch (cpu) {
            case 1:
                System.out.println("cpu: 가위");
                break;
            case 2:
                System.out.println("cpu: 바위");
                break;
            case 3:
                System.out.println("cpu: 보");
                break;
        }


        if (use.equals("가위")) {
            if (cpu == 1) {
                System.out.println("비겼습니다");
            } else if (cpu == 2) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");
            }
        }


        if (use.equals("바위")) {
            if (cpu == 2) {
                System.out.println("비겼습니다");
            } else if (cpu == 1) {
                System.out.println("이겼습니다");
            } else {
                System.out.println("졌습니다");
            }


        }
        if (use.equals("보")) {
            if (cpu == 3) {
                System.out.println("비겼습니다");
            } else if (cpu == 1) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");

            }
        }

    }
}