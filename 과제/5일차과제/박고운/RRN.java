import java.util.Scanner;

public class RRN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("유효한 주민등록번호 확인하기");
        System.out.println("주민등록번호를 입력해주세요");
        String inputSsn = sc.next();


        int[] num= new int[13];
        for(int i=0; i<inputSsn.length(); i++){
            num[i]=Integer.parseInt(inputSsn.substring(i, i+1));
        }//주민번호 배열 숫자 전환

        int[] checkNum = {2,3,4,5,6,7,8,9,2,3,4,5};// 곱하는 수 배열 구성
        int[] result = new int[checkNum.length];
        int tot = 0;// 곱셈 연산 후 누적 합
        for (int i = 0; i < checkNum.length; i++) {
            int tmp = num[i] * checkNum[i]; //각 자리의 수를 곱함
            tot += tmp;
        }

        int pin = (11 - (tot%11))%10; //단, 결과가 10이상이면 10으로 나눈 나머지값을 다시 구함

        if(num[12] == pin){
            //마지막 결과가 주민등록번호 마지막 자리와 일치하면 유효한 주민등록번호
            System.out.println("\""+inputSsn+"\" 는 유효한 주민등록번호입니다.");
        }else{
            System.out.println("\""+inputSsn+"\" 는 유효하지 않은 주민등록번호입니다.");


    }
}}
