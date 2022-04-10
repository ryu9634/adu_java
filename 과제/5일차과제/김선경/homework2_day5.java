import java.util.Scanner;

public class homework2_day5 {
    public static void main(String[] args) {
        System.out.println("주민등록번호 유효성 검사 프로그램");
        System.out.println("주민등록번호를 입력해주세요");
        // 주민등록번호 입력 받음
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        // 주민등록번호를 배열에 숫자로 변환하여 저장하기
        int[] num=new int[13];
        for(int i=0; i<a.length(); i++){
            num[i]=Integer.parseInt(a.substring(i, i+1));
        }

        // 각각 자리에 곱해줄 값
        int[] test= {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

        // 곱한 값을 저장하기 위한 배열
        int[] result=new int[test.length];

        // 곱한 값을 각각 더하기 위한 결과값 변수
        int total=0;

        for(int i=0; i<12; i++){
            result[i]=test[i]*num[i];
            total+=result[i];
        }

        // 더해준 값을 11로 나눈 후 나머지 값을 도출 후 11에서 빼줌
        int na=11-(total%11);

        // 만약 뺀 값이 10을 넘는 경우
        if(na>10) na=(na%10);

        // 주민등록번호 마지막자리와 비교하여 같으면 유효한 값
        if(num[12]==na) System.out.println("유효한 주민등록번호입니다");
        else System.out.println("유효하지 않은 주민등록번호입니다.");


    }
}
