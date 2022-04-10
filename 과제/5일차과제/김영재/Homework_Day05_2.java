import java.util.Scanner;

public class Homework_Day05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요");
        String ans = sc.next();
        int result1 = 0;
        int arr[] = {2,3,4,5,6,7,8,9,2,3,4,5};

        for (int i = 0; i < arr.length;i++){
            result1 += (Integer.parseInt(ans.substring(i,i+1)) * arr[i]); //주민번호와 배열 곱하기
        }

        int result2 = 11 - (result1 % 11) ;
        if(result2 >= 10) result2 %= 10;                                //11로 나눈 후 11로 빼기 나눈 값이 10보다 클 시 10으로 나누기

        if(result2 == Integer.parseInt(ans.substring(12))) System.out.println("유효한 주민등록번호입니다.");
        else System.out.println("유효하지 않은 주민등록번호입니다.");         // 값 출력
    }
}
