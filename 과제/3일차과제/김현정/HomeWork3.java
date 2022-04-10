import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("가위, 바위, 보를 입력하세요");
            String use = sc.next();
            double random = Math.random();
            int cpu = (int) (random * 3) + 1;


            if (use.equals("가위")) {

                if (cpu == 1) {
                    System.out.println("유저: 가위");
                    System.out.println("컴퓨터: 가위");
                    System.out.println("비겼습니다, 다시");
                    continue;
                } else if (cpu == 2) {
                    System.out.println("유저: 가위");
                    System.out.println("컴퓨터: 바위");
                    System.out.println("내가 지다니ㅠㅠ");
                    break;
                } else {
                    System.out.println("유저: 가위");
                    System.out.println("컴퓨터: 보");
                    System.out.println("내가 이겼다");
                    break;
                }
            }


            if (use.equals("바위")) {
                if (cpu == 2) {
                    System.out.println("유저: 바위");
                    System.out.println("컴퓨터: 바위");
                    System.out.println("비겼습니다, 다시");
                    continue;
                } else if (cpu == 1) {
                    System.out.println("유저: 바위");
                    System.out.println("컴퓨터: 가위");
                    System.out.println("내가 이겼다");
                    break;
                } else {
                    System.out.println("유저: 바위");
                    System.out.println("컴퓨터: 보");
                    System.out.println("내가 지다니ㅠㅠ");
                    break;
                }


            }
            if (use.equals("보")) {
                if (cpu == 3) {
                    System.out.println("유저: 보");
                    System.out.println("컴퓨터: 보");
                    System.out.println("비겼습니다, 다시");
                    continue;
                } else if (cpu == 1) {
                    System.out.println("유저: 보");
                    System.out.println("컴퓨터: 바위");
                    System.out.println("내가 이겼다");
                    break;
                } else {
                    System.out.println("유저: 보");
                    System.out.println("컴퓨터: 가위");
                    System.out.println("내가 지다니 ㅠㅠ");
                    break;
                }
            }
        }
    }


}
