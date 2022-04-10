/*
주민등록번호
유효성 검사 프로그램
 */

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해주세요 :");

        String num = sc.next();

        int[] num2 = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int result = 0;

        for (int i = 0; i < num2.length; i++) {
            result += num2[i] * Integer.parseInt(num.substring(i, i + 1));
        }
        int result1 = 11 - result % 11;
        if (result1 >= 10) {
            result1 %= 10;
        }

        if (result1 == Integer.parseInt(num.substring(12))) {
            System.out.println("유효한 주민등록번호 입니다.");
        } else {
            System.out.println("유효한 주민등록번호가 아닙니다.");
            System.out.println("13자리를 입력해주세요.");
        }

        System.out.println();
    }
}
