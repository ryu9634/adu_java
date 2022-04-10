import java.util.Scanner;

public class HomeWork_jumin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 13자리를 입력해주세요(- 제외)");
        String str = sc.next();                                         // 주민등록번호 입력
        int al[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};                // 인덱스별 대입 값
        int tot = 0;
        int result1 = 0;

        if (str.length() == 13) {
            for (int i = 0; i < al.length; i++) {
                tot += al[i] * Integer.parseInt(str.substring(i, i + 1));
            }

            result1 = 11 - (tot % 11);
            if (result1 ==  Integer.parseInt(str.substring(12))) {
                System.out.println("정상입니다.");
            } else if (result1 != Integer.parseInt(str.substring(12))) {
                result1 %= 10;
                if (result1 == Integer.parseInt(str.substring(12))) {
                    System.out.println("정상입니다.");
                } else {
                    System.out.println("다시 입력하세요.");
                }
            } else {
                System.out.println("다시 입력하세요.");
            }
        } else {
            System.out.println("13자리를 맞춰주세요.");
        }
    }
}