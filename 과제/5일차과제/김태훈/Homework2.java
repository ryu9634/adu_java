import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("주민등록번호를 입력하세요 : ");
            String str = sc.next();
            int first6 = 0;
            int last6 = 0;

            if (str.length() == 13) {
                first6 = Integer.parseInt(str.substring(0, 6));
                last6 = Integer.parseInt(str.substring(6, 13));
                System.out.println("주민등록번호 : " + first6 + " - " + last6);
            }else if (str.length() != 13) {
                System.out.println("주민등록번호 13자리를 공백없이 바르게 입력해 주십시오.");
                System.out.println(" ");
                continue;
            }

            int first_step1 = 0;
            int first_step2 = 0;
            int second_step = 0;
            int third_step = 0;

//        - 각자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱하고 모두 더함  - first step
//          (단, 주민등록번호의 마지막 자리는 제외)
            for (int i = 0; i < 8; i++) {
                first_step1 += (Integer.parseInt(str.substring(i, i + 1))) * (i + 2);
            }
            for (int i = 8; i < 12; i++) {
                first_step2 += (Integer.parseInt(str.substring(i, i + 1))) * (i - 6);
            }
//        - 11로 나눈 나머지 값을 구함  - second step
            second_step = (first_step1 + first_step2) % 11;

//        - 11에서 결과값을 뺌   - third step
//                (단, 결과가 10이상이면 10으로 나눈 나머지값을 다시 구함)
//
//        11 - 3 = 8
//        만약 11 - 1 = 10 -> 10 % 10 -> 0
//        만약 11 - 0 = 11 -> 11 % 10 -> 1
            third_step = 11 - second_step;
            if (third_step >= 10) {
                third_step = third_step % 10;
            }

//        - 마지막 결과가 주민등록번호 마지막 자리와 일치하면 유효한 주민등록번호임  - last step
            if (third_step == Integer.parseInt(str.substring(12, 13))) {
                System.out.println("유효한 주민등록번호 입니다.");
                System.out.println(" ");

                System.out.println("한번 더 검사하기 : 아무 Key 누르기 ");
                System.out.println("종료하기 : X ");
                String str1 = sc.next();
                str1.toUpperCase();
                if(str1.equals("X")) {
                    break;
                } else {
                    System.out.println(" ");
                }
            } else if (third_step != Integer.parseInt(str.substring(12, 13))) {
                System.out.println("유효하지 않은 주민등록번호 입니다.");
                System.out.println(" ");

                System.out.println("한번 더 검사하기 : 아무 키 누르기 ");
                System.out.println("종료하기 : X ");
                String str2 = sc.next();
                str2.toUpperCase();
                if(str2.equals("X")) {
                    break;
                } else {
                    System.out.println(" ");
                }
            }

        }
    }
}
