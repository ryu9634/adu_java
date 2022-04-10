import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        boolean Win = false;
        while (true) {
            int com = (int) (Math.random() * 3 + 1);
            System.out.println("가위, 바위, 보 중에서 하나를 선택하세요");

            Scanner sc = new Scanner(System.in);
            String user = sc.next();

            System.out.println("*****결과*****");
            switch (user) {
                case "가위":
                    System.out.println("사용자: 가위");
                    switch (com) {
                        case 1:
                            System.out.println("컴퓨터: 가위");
                            System.out.println("비겼습니다");
                            break;

                        case 2:
                            System.out.println("컴퓨터: 바위");
                            System.out.println("컴퓨터가 이겼습니다");
                            break;

                        case 3:
                            System.out.println("컴퓨터: 보");
                            System.out.println("사용자가 이겼습니다");
                            Win = true;
                            break;

                    }
                    break;

                case "바위":
                    System.out.println("사용자: 바위");
                    switch (com) {
                        case 1:
                            System.out.println("컴퓨터: 가위");
                            System.out.println("사용자가 이겼습니다");
                            Win = true;
                            break;

                        case 2:
                            System.out.println("컴퓨터: 바위");
                            System.out.println("비겼습니다");
                            break;

                        case 3:
                            System.out.println("컴퓨터: 보");
                            System.out.println("컴퓨터가 이겼습니다");
                            break;

                    }break;

                case "보":
                    System.out.println("사용자: 보");
                    switch (com) {
                        case 1:
                            System.out.println("컴퓨터: 가위");
                            System.out.println("컴퓨터가 이겼습니다");
                            break;

                        case 2:
                            System.out.println("컴퓨터: 바위");
                            System.out.println("사용자가 이겼습니다");
                            Win = true;
                            break;
                        case 3:
                            System.out.println("컴퓨터: 보");
                            System.out.println("비겼습니다");
                            break;

                    }break;
            }
            if(Win)  break;
        }
    }
}

