import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중 하나를 선택하세요");
        String user = sc.next();
        double random = Math.random();
        int cpu = (int) (Math.random() * 3) + 1;


        System.out.println("user:" + user);
        if (cpu == 1) {
            System.out.println("cpu:가위");
        } else if (cpu == 2) {
            System.out.println("cpu:바위");
        } else if (cpu == 3) {
            System.out.println("cpu:보");
        }

        if (user.equals("가위")) {
            if (cpu == 1) {
                System.out.println("비겼습니다");
            } else if (cpu == 2) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");
            }

        } else if (user.equals("바위")) {
            if (cpu == 1) {
                System.out.println("비겼습니다");
            } else if (cpu == 2) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");
            }
        } else if (user.equals("보")) {
            if (cpu == 1) {
                System.out.println("졌습니다");
            } else if (cpu == 2) {
                System.out.println("이겼습니다");
            } else {
                System.out.println("비겼습니다");
            }


        }else {
            System.out.println("경고!!! 가위,바위,보 중에서 고르세요!!");
        }
        System.out.println("종료");
    }
}