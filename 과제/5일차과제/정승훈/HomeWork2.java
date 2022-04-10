import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요.");
        String code = sc.next();
        int result = 0;
        int result1;
        int[] num = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            result += (num[i] * Integer.parseInt(code.substring(i, i+1)));
        }
        result1 = 11 - (result % 11);
        if(result1 >= 10){result1 %= 10;}

        if(result1 == Integer.parseInt(code.substring(12))) {
            System.out.println("유효한 주민등록번호입니다.");
        }
        else if(result1 != Integer.parseInt(code.substring(12))) {
            System.out.println("주민등록번호가 일치하지 않습니다.");
        }
    }
}
