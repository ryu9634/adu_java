import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int score = 0;
        while (score < 10) {
            int first = (int) (Math.random() * 10) + 1, second = (int) (Math.random() * 4) + 1,
                    first1 = (int) (Math.random() * 10) + 1, com = 0;

            String second1 = "";

            if (second == 1) {
                second1 = "+";
                com = first + first1;
            } else if (second == 2) {
                second1 = "-";
                com = first - first1;
            } else if (second == 3) {
                second1 = "*";
                com = first * first1;
            } else {
                second1 = "/";
                com = first / first1;
            }

            System.out.println(first + "" + second1 + "" + first1 + "=" + "?");
            int user = sc.nextInt();

            if (user == com) {
                System.out.println("정답입니다. 1점");
                score++;
                System.out.println("현재 점수는 :"+score+"점");
            } else {
                System.out.println("틀렸습니다.");
            }

        }
        System.out.println("정답 :" + (score)+"개");
        System.out.println("프로그램을 종료합니다.");
    }
}
