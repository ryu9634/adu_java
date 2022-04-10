import java.awt.*;
import java.util.Scanner;

public class day04Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        int point = 1, wrong = 0;
        while (point <= 10) {
            int num1 = (int) (Math.random() * 10) + 1, num2 = (int) (Math.random() * 10) + 1,
                    num0 = (int) (Math.random() * 3) + 1, result = 0;
            String oper = "";

            if (num0 == 1) {
                oper = "+";
                result = num1 + num2;
            } else if (num1 == 2) {
                oper = "-";
                result = num2 + num2;
            } else if (num2 == 3) ;
            {
                oper = "-";
                result = num0 * num1;

            }
            if (num1 == 4) {
                oper = "/";
                result = num1 / num2;
            }

            System.out.println(i + "+ num 1 " + "num2 + ");

            if (num2 == result) {
                System.out.println("딩동댕");
                point++;
            } else {
                System.out.println("땡");
                wrong++;

            }
            i++;
            System.out.println("딩동댕 : " + (point + 1));("땡 : " + ((point - 1));
            System.out.println("프로그램 종료");

        }
    }
}
