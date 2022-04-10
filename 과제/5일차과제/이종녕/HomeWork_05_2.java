import java.util.Scanner;

public class HomeWork_05_2 {
    public static void main(String[] args) {
        //주민등록번호를 입력받아 주민등록번호 유효성 검사 프로그램을 만들어보자.
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력해주세요.");

        //    주민등록번호 : 0 0 1 0 1 1 3 0 6 8 5 1 8
        //    -각자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱하고 모두 더함
        //    (단, 주민등록번호의 마지막 자리는 제외)
        //    0 0 1 0 1 1 3 0 6 8 5 1   -> 8
        //    * * * * * * * * * * * *
        //    2 3 4 5 6 7 8 9 2 3 4 5
        //    0 + 0 + 4 + 0 + 6 + 7 + 24 + 0 + 12 +24 + 20 +5 = 102


        String reg = sc.next();

        int[] reg1 = new int[13];
        int[] reg2 = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 0};

        int result = 0;
        for (int i = 0; i < reg.length(); i++) {
            result += reg2[i] * Integer.parseInt(reg.substring(i, i + 1));
        }

        //11로 나눈 나머지 값을 구함
        //102 % 11 = 3
        //11에서 결과값을 뺌
        int result1 =11-result%11;

        System.out.println(result1);
        if(result1 >= 10){
            //   (단, 결과가 10이상이면 10으로 나눈 나머지값을 다시 구함)
            result1 %=10;
            if(result1 == Integer.parseInt(reg.substring(12))){
                System.out.println("올바른 번호 입니다.");
            }else System.out.println("올바른 번호가 아닙니다.");
        }else if(result1 < 10){
            if(result1 ==Integer.parseInt(reg.substring(12))){
                System.out.println("올바른 번호 입니다.");
            }else System.out.println("올바른 번호가 아닙니다.");
        }else System.out.println("올바른 번호가 아닙니다.13자리를 제대로 입력해 주세요(-제외)");











    }
}
