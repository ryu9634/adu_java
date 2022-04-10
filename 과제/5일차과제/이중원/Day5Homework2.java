/*
    날짜 : 2021. 11. 10
    제작자 : 이중원
    과제.
    주민등록번호를 입력받아 주민등록번호 유효성 검사 프로그램
    주민등록번호 : 0 0 1 0 1 1 3 0 6 8 5 1 8
    
    - 각자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱하고 모두 더함
    (단, 마지막 자리는 제외)
    0 0 1 0 1 1 3 0 6 8 5 1  -> 8
    * * * * * * * * * * * *
    2 3 4 5 6 7 8 9 2 3 4 5
    0 0 4 0 6 7 24 0 12 24 20 5 = 102

    - 11로 나눈 나머지 값을 구함
        102 % 11 = 3

    - 11에서 결과값을 뺌
    (단, 결과가 10이상이면 10으로 나눈 나머지값을 다시 구함)

        11 - 3 = 8
        만약 11 - 1 = 10 -> 10 % 10 = 0
        만약 11 - 0 = 11 -> 11 % 10 = 1

    - 마지막 결과가 주민등록번호 마지막 자리와 일치하면 유요한 주민등록번호
*/

import java.util.Scanner;

public class Day5Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호 : ");
        String str = sc.next();

        int[] firstCheck = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int intStr = Integer.parseInt(str.substring(i, i + 1));

            result += firstCheck[i] * intStr;
        }
        //System.out.println(result); // 102

        int secondCheck = 11 - (result % 11);

        if (secondCheck > 9) {
            secondCheck %= 10;
        }
        //System.out.println(secondCheck); // 8

        int lastStr = Integer.parseInt(str.substring(12));

        if (secondCheck == lastStr) {
            System.out.println("유효한 주민번호입니다.");
        } else {
            System.out.println("유효하지 않는 주민번호입니다.");
        }
    }
}