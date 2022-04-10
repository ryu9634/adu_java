import java.util.Scanner;

public class Homework_Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중에 하나를 선택하세요");
        String user = sc.next();

        double random = Math.random();
        int cpu = (int) (random * 3) + 1;
        switch (cpu) {
            case 1:
                System.out.println("컴퓨터 : 가위");
                break;
            case 2:
                System.out.println("컴퓨터 : 바위");
                break;
            case 3:
                System.out.println("컴퓨터 : 보");
                break;
        }

        System.out.println("유저 : " + user);

        if (user.equals("가위")) {
            if (cpu == 1) System.out.println("비겼습니다!");
            else if (cpu == 2) System.out.println("졌습니다!");
            else if (cpu == 3) System.out.println("이겼습니다!");

        }else if (user.equals("바위")) {
            if (cpu == 1) System.out.println("이겼습니다!");
            else if (cpu == 2) System.out.println("비겼습니다!");
            else if (cpu == 3) System.out.println("졌습니다!");

        }else if (user.equals("보")) {
            if (cpu == 1) System.out.println("졌습니다!");
            else if (cpu == 2) System.out.println("이겼습니다!");
            else if (cpu == 3) System.out.println("비겼습니다!");

        }else System.out.println("잘못된 값을 입력하셨습니다.");


    }
}
