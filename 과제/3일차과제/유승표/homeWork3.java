/*
가위바위보 게임 만들기

결과
가위, 바위, 보 중 하나를 선택하세요.

컴퓨터 : 보
유저 : 가위
이겼습니다.

컴퓨터 : 가위
유저 : 보
졌습니다.

컴퓨터 : 보
유저 : 보
비겼습니다.


*/

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("결과\n가위, 바위, 보 중 하나를 선택하세요.");
        String RCP = sc.next();
        double random = Math.random();
        int com1 = ((int) random * 10) % 3;
        String computer;
        if (com1 == 1) {
            computer = "가위";
        } else if (com1 == 2) {
            computer = "바위";
        } else {
            computer = "보";
        }


        if (RCP.equals("가위")) {
            System.out.println("컴퓨터 : " + computer + "\n유저 : 가위");
        } else if (RCP.equals("바위")) {
            System.out.println("컴퓨터 : " + computer + "\n유저 : 바위");
        } else {
            System.out.println("컴퓨터 : " + computer + "\n유저 : 보");
        }
        switch (com1){   // 1= 가위 ,2 =바위
            case 1:   //가위
                if (RCP.equals("가위")){
                    System.out.println("비겼습니다.");
                } else if (RCP.equals("바위")) {
                    System.out.println("이겼습니다.");
                }else {
                    System.out.println("패배");
                }
            case 2: //바위
                if (RCP.equals("가위")){
                    System.out.println("패배.");
                } else if (RCP.equals("바위")) {
                    System.out.println("비겼습니다.");
                }else {
                    System.out.println("이겼습니다.");
                }
            case 0: //보
                if (RCP.equals("가위")){
                    System.out.println("이겼습니다.");
                } else if (RCP.equals("바위")) {
                    System.out.println("패배.");
                }else {
                    System.out.println("비겼습니다.");
                }


        }
    }
}














       /* double random = Math.random();
        double com1 = (random * 10);
        switch ((int) com1) {
            case 1:
            case 2:
            case 4:
                String muk = "바위";
                break;
            case 5:
            case 6:
            case 7:
                String bo = "보";
                break;
            default:
                String jji = "가위";
        }


        System.out.println(com1);
*/


/*
        Scanner sc = new Scanner(System.in);
        System.out.print("결과\n가위, 바위, 보 중 하나를 선택하세요.");
        String player = sc.next();
        String computer;

        int computerRandom = (int) (Math.random() * 3);

        switch (computerRandom) {
            case 0:
                computer = "가위";
                break;
            case 1:
                computer = "바위";
                break;
            default:
                computer = "보";

        }
        if (player.equals("가위") || player.equals("바위") || player.equals("보")) {
            System.out.println("플레이어 : " + player);
            System.out.println("컴퓨터 : " + computer);
        }

        if (player.equals("가위"))                // 가위를 낼 경우   0 : 가위 / 1 : 바위 / 2 : 보
            System.out.println(computerRandom == 0 ? "비겼습니다!" : computerRandom == 1 ? "졌습니다!" : "이겼습니다!");

        else if (player.equals("바위")) {         // 바위를 낼 경우
            if (computer.equals("바위"))
                System.out.println("비겼습니다!");
            else if (computer.equals("가위"))
                System.out.println("이겼습니다!");
            else
                System.out.println("졌습니다!");
        }
        else if (player.equals("보")) {           // 보를 낼 경우  0 : 가위 / 1 : 바위 / 2 : 보
            switch (computerRandom) {
                case 0:
                    System.out.println("졌습니다!");
                    break;
                case 1:
                    System.out.println("이겼습니다!");
                    break;
                case 2:
                    System.out.println("비겼습니다!");
                    break;
            }
        } else
            System.out.println("다시 입력해주세요.");
    }
*/
