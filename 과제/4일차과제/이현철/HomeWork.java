import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("결과");
        Scanner sc = new Scanner(System.in);
        System.out.println("가위,바위,보 중 하나를 선택해주세요 ");
        System.out.println("1=가위,2=바위,3=보");
        String user = sc.next();

        double random = Math.random();
        int cpu = (int) (random * 3) + 1;
        int a = 0;
            switch (cpu) {
                case 1:
                    System.out.println("컴퓨터 :가위");
                    break;
                case 2:
                    System.out.println("컴퓨터 :바위");
                    break;
                case 3:
                    System.out.println("컴퓨터 :보");
                default:

                    if (user.equals("가위")) {
                        System.out.println("사용자 : 가위");
                    } else if (user.equals("바위")) {
                        System.out.println("사용자 : 바위");
                    } else if (user.equals("보")) {
                        System.out.println("사용자 : 보");
                    }
                    System.out.println("==========================================");

        if (cpu==1) {
            System.out.println("컴퓨터 : 가위");
        } else if (cpu==2) {
            System.out.println("컴퓨터 : 바위");
        } else if (cpu==3) {
            System.out.println("컴퓨터 : 보");
        }
                    if (user.equals("가위")) {
                        System.out.println("사용자 : 가위");
                    } else if (user.equals("바위")) {
                        System.out.println("사용자 : 바위");
                    } else {
                        System.out.println("사용자 : 보");
                    }
                    System.out.println("==========================================");
                    if (user.equals("가위")) {
                        boolean b = cpu == 1;
                        System.out.println("비겼습니다");
                    } else if (user.equals("바위")) {
                        boolean b = cpu == 2;
                        System.out.println("졌습니다");
                    } else if (user.equals("보")) {
                        boolean b = cpu == 3;
                        System.out.println("이겼습니다");
                    } else System.out.println("프로그램을 종료합니다");


        }
    }
}