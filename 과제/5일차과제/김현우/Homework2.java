import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 : ");
        String str = sc.next();

        int[] multiply = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int plus = Integer.parseInt(str.substring(i, i + 1));

            result += multiply[i] * plus;
        }

        int div = 11 - (result % 11);

        if (div > 9) {
            div %= 10;
        }

        int check = Integer.parseInt(str.substring(12));

        if (div == check) {
            System.out.println("유효한 주민번호입니다.");
        } else {
            System.out.println("잘못된 주민번호입니다.");
        }
    }
}
