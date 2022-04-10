import java.util.Scanner;

/*
                    주민등록번호를 입력 받아 주민등록번호 유효성 검사 프로그램을 만들어보자
                    주민등록번호 : 0 0 1 0 1 1 - 3 0 6 8 5 1 8
                    - 각 자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱하고 모두 더함
                    (단, 주민등록번호의 마지막 자리는 제외)
                    0 0 1 0 1 1 - 3 0 6 8 5 1   ->   8
                    * * * * * *   * * * * * *
                    2 3 4 5 6 7   8 9 2 3 4 5
                    0 0 4 0 6 7  24 0 12 24 20 5 = 102

                    9 6 1 0 2 2   1 1 5 7 6 1        1
                    * * * * * *   * * * * * *
                    2 3 4 5 6 7   8 9 2 3 4 5
                    18 18 4 0 12 14 8 9 10 21 24 5

                    - 11로 나눈 나머지 값을 구함
                        102 % 11 = 3
                    - 11에서 결과값을 뺌
                    (단, 결과가 10이상이면 10으로 나눈 나머지 값을 다시 구함)
                        11 - 3 = 8
                        만약 11 - 1 = 10 -> 10 % 10 = 0

                    - 마지막 결과가 주민등록 번호 마지막 자리와 일치하면 유효한 주민등록번호

                    주민번호를 입력하세요 >>> 0010113068518 // 13자리
                    유효한 주민번호입니다.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 >>> ");
        String str = sc.next();

        int[] result = new int[13]; // 13개 0~12
        int[] key = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 0}; // 13개
        int sum = 0;

        for (int i = 0; i < str.length(); i++) { // 12개
            result[i] = Integer.parseInt(str.substring(i, i + 1)); // 0 0 1 0 1 1 3 0 6 8 5 1 8
            sum += result[i] * key[i]; // 102
        }

        int num = sum % 11; // 102 % 11 = 3
        int result1 = 11 - num; // 11-0, 11-3

            if (result1 < 10) {
                if (result[12] == result1) { // 8 == 8?
                    System.out.println("유효한 주민번호입니다.");
                }else{
                    System.out.println("입력하신 주민번호는 유효하지않은 주민번호입니다. 다시 입력바랍니다.");
                }
            } else {
                if (result[12] == (result1 % 10)) {
                    System.out.println("유효한 주민번호입니다.");
                }else{
                    System.out.println("입력하신 주민번호는 유효하지않은 주민번호입니다. 다시 입력바랍니다.");
                }
            }
    }
}
