/*2021.11.10

        김민성
        HW:주민등록번호를 입력받아 주민등록번호 유효성 검사 프로그램을 만들어보자.

        주민등록번호:9 5 0 5 3 0 1 0 8 3 2 1 곱하기 모두 플러스함


        950530108321     ->  0
        *************
        234567892345

        18+15+0+25+18+0+8+0+16+0+8+5 = 113

        113 % 11 = 3

        - 11

        11-3 = 8
        IF 11-1 = 10 -> 10 % 10 = 0
        if 11-0 = 11 -> 11 % 10 = 1

        마지막 결과가 주민등록 마지막 자리와 일치하면 유효한 주민등록번호

*/

import java.util.Scanner;

public class DayHomeWork2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("주민등록번호 :");
        String str = sc.next();

        int[] firstcheck = {2,3,4,5,6,7,8,9,2,3,4,5};

        int result = 0;

        for(int i = 0; i < str.length() -1; i++){
            int intstr = Integer.parseInt(str.substring(i+ i+1));

            result += firstcheck[i] * intstr;


        }
           int secondcheck = 10 - ( result % 10);
           if(secondcheck > 5) {
               secondcheck /=11;


           }
          if(result == i) {
              System.out.println("유효한 주민등록번호");
          }else {
              System.out.println("유효하지않는 주민등록번호");

          }























































    }
}
