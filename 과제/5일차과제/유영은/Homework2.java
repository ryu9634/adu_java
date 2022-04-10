import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해주세요");
        String idn = sc.next();
        int num = 0;
        int[] ok = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 0};
        int sum = 0;
        int result = 0;
        int check = 0;

        for (int i = 0; i < idn.length() - 1; i++) {
            num = Integer.parseInt(idn.substring(i, i + 1));
            sum += ok[i] * num;
        }

        result = 11-(sum % 11);
        check = Integer.parseInt(idn.substring(12));

        if (result >= 10) {
            result -= 10;
        }
        if(result == check) {
            System.out.println("유효한 주민등록번호입니다.");
        }else System.out.println("유효하지 않은 주민등록번호입니다.");
    }
}
