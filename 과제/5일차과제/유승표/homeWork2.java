import java.util.Scanner;

/*
과제2.
주민등록번호를 입력받아 주민등록번호 유효성 검사 프로그램을 만들어보자.
 주민등록번호 : 0 0 1 0 1 1 3 0 6 8 5 1 8

 - 각자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱하고 모두 더함
 (단, 주민등록번호의 마지막 자리는 제외)
   0 0 1 0 1 1 3 0 6 8 5 1 ->8
   * * * * * * * * * * * *
   2 3 4 5 6 7 8 9 2 3 4 5
   0 + 0 + 4 + 0 + 6 + 7 + 24 + 0 + 12 + 24 + 20 + 5 = 102

 - 11로 나눈 나머지 값을 구함

  102 % 11 = 3

 - 11에서 결과값을 뺌
 (단, 결과가 10 이상이면 10으로 나눈 나머지 값을 다시구함)

    11 - 3 = 8 상관없음
    만약 11 - 1 = 10 -> 10 % 10 -> 0
    만약 11 - 0 = 11 -> 11 % 10 -> 1

 - 마지막 결과가 주민등록번호 마지막 자리와 일치하면 유효한 주민등록번호이다.
 */
public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 유효성 검사 프로그램");
        System.out.println("주민번호 13자리를 입력하세요");
        String ID = sc.next();  //주민번호 입력

        // 주민번호를 배열에 숫자로 변환
        int[] num = new int[13];

        System.out.print("주민등록번호 : ");

        for (int i = 0; i < ID.length(); i++) {
            num[i] = Integer.parseInt(ID.substring(i, i + 1));
        }
                      //{2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int[] CodeNum = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5}; //곱해줄 숫자
        int[] result = new int[CodeNum.length];
        int sumNum =0; //더한 값을 나타낼 변수

        for (int i=0; i <12; i++) {
            result[i] = num[i] * CodeNum[i];
            sumNum += result[i];
        }
        /*  11로 나눈 나머지 값을 구함
            102 % 11 = 3
            11에서 결과값을 뺌
            (단, 결과가 10 이상이면 10으로 나눈 나머지 값을 다시구함)
        */
        int Midresult = 11 - ( sumNum % 11);
        if ( Midresult > 10 ) {
            Midresult = Midresult % 10;
        }

        if ( num[12] == Midresult ) {
            System.out.println("-- 유효한 주민등록번호 입니다. --");
        } else {
            System.out.println("-- 유효하지  않은 주민등록번호 입니다. --");
        }
    }


}