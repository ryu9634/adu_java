//2. 주민등록번호를 입력받아 주민등록번호 유효성 검가 프로그램을 만들어보자.
//        주민등록번호 : 0 0 1 0 1 1 3 0 6 8 5 1 8 //String으로 받아 숫자화
//
//        - 각 자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱하고 모두 더함
//        (단, 주민등록번호의 마지막 자리는 제외)
//
//        0 0 1 0 1 1 3 0 6 8 5 1 -> 8
//        * * * * * * * * * * * *
//        2 3 4 5 6 7 8 9 2 3 4 5
//        0 + 0 + 4 + 0 + 6 + 7 + 24 + 0 + 12 + 24 + 20 + 5 = 102
//
//        - 11로 나눈 나머지 값을 구함
//
//        102 % 11 = 3
//
//        - 11에서 결과값을 뺌
//        (단, 결과가 10이상이면 10으로 나눈 나머지값을 다시 구함)
//
//        11 - 3 = 8
//        만약 11 - 1 = 10 -> 10 % 10 -> 0
//        만약 11 - 0 = 11 -> 11 % 10 -> 1
//
//        - 마지막 결과가 주민등록번호 마지막 자리와 일치하면 유효한 주민등록번호임
//
//        주민등록번호를 입력하세요 0010113068518
//        유효한 주민등록번호입니다.
//
//        주민등록번호를 입력하세요 0010113068519
//        유효하지 않은 주민등록번호입니다.

import java.util.Scanner;

public class Day5Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 유효성 검사입니다.");
        int[] code = {2,3,4,5,6,7,8,9,2,3,4,5};
        int total = 0;

        System.out.println("주민등록번호 13자리를 입력해 주세요.");
        String num = sc.next();
        if(num.length() !=13){
            System.out.println("경고 : 유효하지 않은 주민등록번호입니다.");
        }

        for (int i = 0; i < code.length; i++) {
            total += code[i] * Integer.parseInt(num.substring(i, i + 1));
        }
        int lastNum = 11 - total % 11;
        if (lastNum >= 10) {
            lastNum %= 10;
        }
        System.out.println(lastNum);

        if(lastNum == Integer.parseInt(num.substring(12))){
            System.out.println("올바른 주민등록번호입니다.");
        }else{
            System.out.println("올바르지 않은 주민등록번호입니다.");
        }
        System.out.println("주민등록번호 유효성 검사 완료.");
    }
}
