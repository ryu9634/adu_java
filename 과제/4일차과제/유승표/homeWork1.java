import java.util.Scanner;

/*
가위바위보 게임을 만들어보자.
(단, 유저가 이길때까지 게임을 반복)
결과
가위, 바위, 보 중 하나를 선택하세요. 가위

컴퓨터 : 보
유저 : 가위
이겼습니다!
 */
public class homeWork1 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 1; ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
        String user = sc.next();
        double random = Math.random();
        int com1 = (int) (random * 10) % 3;
        String computer = null;
        if (com1 == 1) {
            computer = "가위";
        } else if (com1 == 2) {
            computer = "바위";
        } else if (com1 == 0) {
            computer = "보";
        }

            if (user.equals("가위")) {
                System.out.println("컴퓨터 : " + computer + "\n유저 : 가위");
            } else if (user.equals("바위")) {
                System.out.println("컴퓨터 : " + computer + "\n유저 : 바위");
            } else if (user.equals("보")) {
                System.out.println("컴퓨터 : " + computer + "\n유저 : 보");
            } else {
                System.out.println("다시");
            }
            switch (com1) {   // 1= 가위 ,2 =바위
                case 1:   //가위
                    if (user.equals("가위")) {
                        System.out.println("다시");
                    } else if (user.equals("바위")) {
                        System.out.println("승리");
                        i++;
                    } else if (user.equals("보")) {
                        System.out.println("패배");
                    }
                    break;
                case 2: //바위
                    if (user.equals("가위")) {
                        System.out.println("패배.");
                    } else if (user.equals("바위")) {
                        System.out.println("다시");
                    } else if (user.equals("보")) {
                        System.out.println("승리");
                        i++;
                    }
                    break;
                case 0: //보
                    if (user.equals("가위")) {
                        System.out.println("승리");
                        i++;
                    } else if (user.equals("바위")) {
                        System.out.println("패배.");
                    } else if (user.equals("보")) {
                        System.out.println("다시");
                    }
                    break;
            }
            System.out.println();
        }
    }
}








