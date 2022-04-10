import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위, 바위, 보 중 하나를 선택하세요.");
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
}
