import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int point = 1, wrong = 0;
        while (point <= 10) {
            int num1 = (int) (Math.random() * 10) + 1, num2 = (int) (Math.random() * 10) + 1,
                    numO = (int) (Math.random() * 4) + 1, result = 0;
            String oper = "";

            if (numO == 1) {
                oper = "+";
                result = num1 + num2;
            } else if (numO == 2) {
                oper = "-";
                result = num1 - num2;
            } else if (numO == 3) {
                oper = "*";
                result = num1 * num2;
            } else {
                oper = "/";
                result = num1 / num2;
            }
            System.out.println(i + ") " + num1 + " " + oper + " " + num2 + " = ?");
            int choice = sc.nextInt();

            if (choice == result) {
                System.out.println("맞췄습니다. (1점)");
                point++;
            } else {
                System.out.println("틀렸습니다.");
                wrong++;
            }
            i++;
        }
        System.out.println("정답 : " + (point - 1) + "\n오답 : " + wrong);
        System.out.println("프로그램이 종료되었습니다.");
    }
}
